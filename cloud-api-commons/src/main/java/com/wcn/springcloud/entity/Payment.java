package com.wcn.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author wangchaonan
 * @Date 2020-11-24 13:59
 * @Version 1.0
 */
@Data
@AllArgsConstructor//全参
@NoArgsConstructor//空参
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
