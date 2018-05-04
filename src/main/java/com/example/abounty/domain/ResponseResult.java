package com.example.abounty.domain;

/**
 *
 *
 * 定义一个相对通用的JSON响应结构其中包含两部分：
 * 元数据与返回值，元数据表示操作是否成功与返回值消息等，返回值对应服务端方法所返回的数据。
 * {data": {...},"meta": {"code": "0","message": "成功"}}
 * @author 刘铖
 * @since 2018/5/2
 */


public class ResponseResult<T> {

    private CodeMessage meta;
    private T data;

    public ResponseResult(T data) {
        this(CoreConstants.RETURN_CODE_SUCCESS.getCode(), CoreConstants.RETURN_CODE_SUCCESS.getMessage(), data);
    }

    public ResponseResult() {
        this.meta = new CodeMessage();
    }

    public void setMeta(CodeMessage meta) {
        this.meta = meta;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseResult(String code, String message) {
        this(code, message, null);
    }

    public ResponseResult(String code, String message, T data) {
        this.meta = new CodeMessage();
        this.meta.setCode(code);
        this.meta.setMessage(message);
        this.data = data;
    }


    public ResponseResult(CodeMessage codeMessage) {
        this(codeMessage.getCode(), codeMessage.getMessage(), null);
    }

    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult(data);
    }

    public static <T> ResponseResult<T> fail(String code, String message) {
        return new ResponseResult(code, message);
    }

    public T getData() {
        return this.data;
    }

    public CodeMessage getMeta() {
        return this.meta;
    }

    public boolean checkSuccess() {
        return null != this.meta && CoreConstants.RETURN_CODE_SUCCESS.getCode().equals(this.meta.getCode());
    }
}
