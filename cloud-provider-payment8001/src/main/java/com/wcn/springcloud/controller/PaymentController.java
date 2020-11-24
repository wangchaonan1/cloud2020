package com.wcn.springcloud.controller;

import com.wcn.springcloud.entity.CommonResult;
import com.wcn.springcloud.entity.Payment;
import com.wcn.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author wangchaonan
 * @Date 2020-11-24 14:55
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("**** 插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功！", result);
        } else {
            return new CommonResult(444, "插入失败！");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("**** 查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功！", payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询id！", id);
        }
    }
}
