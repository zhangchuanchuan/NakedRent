package com.stream.nakedrent.vo;

/**
 * description：
 * ===============================
 * creator：58
 * create time：2016/8/11 23:43
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class GoodsDetailVo {
    private String id;
    private String goodValue;
    private String description="ThinkPad T410 这是一台特别好用的电脑，硬盘也特别大。内存也大。总之特别好！";
    private String url;
    private String price="450元/月";
    private String old;
    private String rentTime;
    private String stock="库存：12";//库存

    private String default_url = "";

    public GoodsDetailVo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodValue() {
        return goodValue;
    }

    public void setGoodValue(String goodValue) {
        this.goodValue = goodValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getRentTime() {
        return rentTime;
    }

    public void setRentTime(String rentTime) {
        this.rentTime = rentTime;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDefault_url() {
        return default_url;
    }

    public void setDefault_url(String default_url) {
        this.default_url = default_url;
    }
}
