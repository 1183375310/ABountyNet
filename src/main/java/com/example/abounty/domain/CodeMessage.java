package com.example.abounty.domain;

import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
/**
 *
 * 请求元数据"meta": {"code": "0","message": "成功"}
 * @author 刘铖
 * @since 2018/5/2
 */


public class CodeMessage {
    private static final String PATTERN = "\\$\\{.*\\}";
    private String code;
    private String message;

    public CodeMessage() {
    }

    public CodeMessage(String code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(String paramValue) {
        StringUtils.replacePattern("","","");
        return StringUtils.replacePattern(this.message, "\\$\\{.*\\}", paramValue);
    }

    public String getMessage(Map<String, String> paramValues) {
        String msg = this.message;

        Map.Entry entry;
        for(Iterator var4 = paramValues.entrySet().iterator(); var4.hasNext(); msg = StringUtils.replacePattern(msg, "\\$\\{" + (String)entry.getKey() + "\\}", (String)entry.getValue())) {
            entry = (Map.Entry)var4.next();
        }

        return msg;
    }

    public String toString() {
        return "code = " + this.code + "，message = " + this.message;
    }

}
