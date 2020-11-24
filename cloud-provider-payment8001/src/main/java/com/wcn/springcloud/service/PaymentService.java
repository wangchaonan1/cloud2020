package com.wcn.springcloud.service;

import com.wcn.springcloud.entity.Payment;

/**
 * @Author wangchaonan
 * @Date 2020-11-24 14:32
 * @Version 1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
