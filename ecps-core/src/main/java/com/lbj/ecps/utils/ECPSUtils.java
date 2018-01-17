package com.lbj.ecps.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;*/

public class ECPSUtils {

//	private static SolrServer ss;
	
	public static String readProp(String key){
		String value = null;
		InputStream in = ECPSUtils.class.getClassLoader().getResourceAsStream("ecps_prop.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
			value = prop.getProperty(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
	}
	
	/*public static SolrServer getSolrServer(){
		if(ss != null){
			return ss;
		}else{
			String solrPath = ECPSUtils.readProp("solr_path");
			ss = new HttpSolrServer(solrPath);
			return ss;
		}
		
	}*/
}
