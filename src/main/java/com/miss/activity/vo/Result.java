package com.miss.activity.vo;

import com.miss.activity.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 前端返回结果
 *
 * @author dingzi
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result<T> {

    private int code;
    private String message;
    private T data;

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public Result(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    public static Result success() {
        return new Result(ResultCode.SUCCESS, null);
    }

    public static <T> Result<T> success(T data) {
        return new Result(ResultCode.SUCCESS, data);
    }

    public static Result fail() {
        return new Result(ResultCode.FAIL);
    }

    public static Result fail(int code, String message) {
        return new Result(code, message, null);
    }

    public static Result fail(String message) {

        return new Result(-1, message, null);
    }

    public static Result fail(ResultCode resultCode) {
        return new Result(resultCode.getCode(), resultCode.getMessage());
    }

}
