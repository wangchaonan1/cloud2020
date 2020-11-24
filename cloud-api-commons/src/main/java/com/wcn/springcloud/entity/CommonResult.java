package com.wcn.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author wangchaonan
 * @Date 2020-11-24 14:07
 * @Version 1.0
 */
@Data
@AllArgsConstructor//全参
@NoArgsConstructor//空参
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
