/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ispc.slibrary.dto;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author edgar
 */
public class Response {

    public static final String RESPONSE_OK = "OK";
    public static final String RESPONSE_NOT_OK = "NOT_OK";

    private String message;
    private String status;
    private Integer code;
    private Map<String, Object> fields = new TreeMap<>();

    public Response() {
        this.status = RESPONSE_OK;
    }

    public Response(String message, String estatus) {
        this.message = message;
        this.status = estatus;
    }

    public static Response getInstance() {
        Response r = new Response();
        r.setStatus(RESPONSE_OK);
        r.setCode(0);
        return r;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map<String, Object> getFields() {
        return fields;
    }

    public void setFields(Map<String, Object> fields) {
        this.fields = fields;
    }

    public void addField(String key, Object value) {
        this.fields.put(key, value);
    }

    public Object getField(String Key) {
        return this.fields.get(Key);

    }
}
