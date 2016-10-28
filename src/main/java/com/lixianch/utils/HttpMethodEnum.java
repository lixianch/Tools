package com.lixianch.utils;

/**
 * Created by lixianch on 2016/10/28.
 */
public enum HttpMethodEnum {
    get("get", "GET请求"),
    post("post", "POST请求"),
    put("put", "PUT请求"),
    delete("delete", "DELETE请求");

    private String method;
    private String desc;

    private HttpMethodEnum(String method, String desc) {
        this.method = method;
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
