package com.lbj.ecps.controller;

import com.lbj.ecps.utils.ECPSUtils;
import com.sun.deploy.util.SessionState;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by gqq on 2018/1/17.
 */
@Controller
@RequestMapping(value = "/upload")
public class UploadController {

    //文件上传
    @RequestMapping(value = "/uploadPicture.do",method = RequestMethod.POST)
    public void  uploadPicture(HttpServletRequest request, String lastRealPath, PrintWriter out)throws Exception{
        //request强行转换
        MultipartHttpServletRequest mr= (MultipartHttpServletRequest) request;
        //获取表单中上传文件的所有type=file的name;
        Iterator<String> fileNames = mr.getFileNames();
        //后台只有一个上传文件，则取第一个
        String fileName =fileNames.next();
        //获得文件
        MultipartFile mf = mr.getFile(fileName);
        byte[] mfs = mf.getBytes();
        //定义上传后的文件名字
        String newFileName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        Random random = new Random();
        for(int i = 0; i < 3; i++){
            newFileName = newFileName + random.nextInt(10);
        }
        //获得后缀名
        String oriFileName = mf.getOriginalFilename();
        String suffix = oriFileName.substring(oriFileName.lastIndexOf("."));
        //要上传文件的绝对路径
        String realPath = ECPSUtils.readProp("upload_file_path")+"/upload/"+newFileName + suffix;
        String relativePath = "/upload/"+newFileName + suffix;
        //由于我们需要在不同主机上上传不能直接通过流的方式写文件
        //创建Jersey客户端
        Client client = Client.create();
        //判断是不是第一次上传
        if(StringUtils.isNotBlank(lastRealPath)){
            WebResource wr = client.resource(lastRealPath);
            wr.delete();
        }
        //指定要上传的具体的地址,参数就是要上传的图片的绝对路径
        WebResource wr = client.resource(realPath);
        //文件的上传到文件主机上
        wr.put(mfs);
        //使用json对象把绝对路径和相对路径写回去
        JSONObject jo = new JSONObject();
        jo.accumulate("realPath", realPath);
        jo.accumulate("relativePath", relativePath);
        //{"realPath":"http://...", "relativePath":"/upload/.."}
        String result = jo.toString();
        out.write(result);
    }
}
