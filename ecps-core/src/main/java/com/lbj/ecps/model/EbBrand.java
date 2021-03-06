package com.lbj.ecps.model;

public class EbBrand {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_BRAND.BRAND_ID
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    private Long brandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_BRAND.BRAND_NAME
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    private String brandName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_BRAND.BRAND_DESC
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    private String brandDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_BRAND.IMGS
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    private String imgs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_BRAND.WEBSITE
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    private String website;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_BRAND.BRAND_SORT
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    private Integer brandSort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_BRAND.BRAND_ID
     *
     * @return the value of EB_BRAND.BRAND_ID
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_BRAND.BRAND_ID
     *
     * @param brandId the value for EB_BRAND.BRAND_ID
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_BRAND.BRAND_NAME
     *
     * @return the value of EB_BRAND.BRAND_NAME
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_BRAND.BRAND_NAME
     *
     * @param brandName the value for EB_BRAND.BRAND_NAME
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_BRAND.BRAND_DESC
     *
     * @return the value of EB_BRAND.BRAND_DESC
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public String getBrandDesc() {
        return brandDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_BRAND.BRAND_DESC
     *
     * @param brandDesc the value for EB_BRAND.BRAND_DESC
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc == null ? null : brandDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_BRAND.IMGS
     *
     * @return the value of EB_BRAND.IMGS
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public String getImgs() {
        return imgs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_BRAND.IMGS
     *
     * @param imgs the value for EB_BRAND.IMGS
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_BRAND.WEBSITE
     *
     * @return the value of EB_BRAND.WEBSITE
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public String getWebsite() {
        return website;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_BRAND.WEBSITE
     *
     * @param website the value for EB_BRAND.WEBSITE
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_BRAND.BRAND_SORT
     *
     * @return the value of EB_BRAND.BRAND_SORT
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public Integer getBrandSort() {
        return brandSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_BRAND.BRAND_SORT
     *
     * @param brandSort the value for EB_BRAND.BRAND_SORT
     *
     * @mbggenerated Mon Jan 15 22:10:21 CST 2018
     */
    public void setBrandSort(Integer brandSort) {
        this.brandSort = brandSort;
    }
}