package com.yuanmf.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String PaymentInfo_OK(Integer id) {
        return "---------PaymentFallbackService fall back PaymentInfo_OK  " +id;
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---------PaymentFallbackService fall back paymentInfo_TimeOut  "+id;
    }
}
