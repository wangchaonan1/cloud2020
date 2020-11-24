package com.wcn.springcloud.dao;

import com.wcn.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author wangchaonan
 * @Date 2020-11-24 14:16
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
