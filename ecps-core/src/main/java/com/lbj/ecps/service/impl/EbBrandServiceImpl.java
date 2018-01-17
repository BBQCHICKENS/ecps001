package com.lbj.ecps.service.impl;

import com.lbj.ecps.dao.EbBrandMapper;
import com.lbj.ecps.model.EbBrand;
import com.lbj.ecps.service.EbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gqq on 2018/1/15.
 */
@Service
public class EbBrandServiceImpl implements EbBrandService {

    @Autowired
    private EbBrandMapper brandMapper;
    @Override
    public int deleteByPrimaryKey(Long brandId) {
        return brandMapper.deleteByPrimaryKey(brandId);
    }

    @Override
    public int insert(EbBrand record) {
        return brandMapper.insert(record);
    }

    @Override
    public int insertSelective(EbBrand record) {
        return brandMapper.insertSelective(record);
    }

    @Override
    public EbBrand selectByPrimaryKey(Long brandId) {
        return brandMapper.selectByPrimaryKey(brandId);
    }

    @Override
    public int updateByPrimaryKeySelective(EbBrand record) {
        return brandMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EbBrand record) {
        return brandMapper.updateByPrimaryKey(record);
    }

    @Override
    public boolean validateBrandName(String brandName) {
        boolean flag=false;
        int i = brandMapper.validateBrandName(brandName);
        if(i==0){
            flag=true;
        }
        return flag;
    }

    @Override
    public List<EbBrand> selectAllBrands() {
        return brandMapper.selectAllBrands();
    }
}
