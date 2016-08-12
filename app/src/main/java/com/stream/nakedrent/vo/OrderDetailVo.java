package com.stream.nakedrent.vo;

import java.io.Serializable;

/**
 * description：
 * ===============================
 * creator：58
 * create time：2016/8/11 23:47
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class OrderDetailVo implements Serializable{
    private String id;
    private String name = "名称：ThinkPad T410 i5 xxx";
    private String count = "数量：5";
    private String time = "租期：12个月";

    private String url;

    private String default_url = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDefault_url() {
        return default_url;
    }

    public void setDefault_url(String default_url) {
        this.default_url = default_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
