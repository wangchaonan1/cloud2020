package com.wcn.springcloud.service.impl;

import com.wcn.springcloud.dao.PaymentDao;
import com.wcn.springcloud.entity.Payment;
import com.wcn.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wangchaonan
 * @Date 2020-11-24 14:47
 * @Version 1.0
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
