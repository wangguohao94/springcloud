package com.wgh.springcloud.cloudconsumerfeignhystrixorder80.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentCallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentCallbackService___";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentCallbackService___";
    }
}
