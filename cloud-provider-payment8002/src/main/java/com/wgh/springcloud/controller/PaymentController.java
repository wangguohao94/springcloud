package com.wgh.springcloud.controller;

import com.wgh.springcloud.entities.CommonResult;
import com.wgh.springcloud.entities.Payment;
import com.wgh.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentServiceImpl;

    @Value("${server.port}")
    private String servicePort;


    @PostMapping(value = "payment/create")
    @ResponseBody
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentServiceImpl.create(payment);
        log.info("**********插入结果：" + result + "123");
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,servicePort：" + servicePort, payment);
        } else {
            return new CommonResult(400, "插入数据库失败");
        }
    }

    @GetMapping(value = "payment/get/{id}")
    @ResponseBody
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentServiceImpl.getPaymentById(id);
        log.info("**********查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询数据库成功,servicePort：" + servicePort, payment);
        } else {
            return new CommonResult(400, "查询数据库失败，查询ID为：" + id);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return servicePort;
    }
}
