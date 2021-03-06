package com.lbj.ecps.service;

import com.lbj.ecps.model.EbBrand;

import java.util.List;

/**
 * Created by gqq on 2018/1/15.
 */
public interface EbBrandService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EB_BRAND
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    int deleteByPrimaryKey(Long brandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EB_BRAND
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    int insert(EbBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EB_BRAND
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    int insertSelective(EbBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EB_BRAND
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    EbBrand selectByPrimaryKey(Long brandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EB_BRAND
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    int updateByPrimaryKeySelective(EbBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EB_BRAND
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    int updateByPrimaryKey(EbBrand record);

    boolean validateBrandName(String brandName);

    List<EbBrand> selectAllBrands();
}
