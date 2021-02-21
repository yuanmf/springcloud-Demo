package com.yuanmf.springcloud.service.impl;

import com.yuanmf.springcloud.dao.PaymentDao;
import com.yuanmf.springcloud.entity.Payment;
import com.yuanmf.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
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
