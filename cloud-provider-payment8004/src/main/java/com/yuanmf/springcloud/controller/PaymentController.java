package com.yuanmf.springcloud.controller;

import com.yuanmf.springcloud.entity.CommonResult;
import com.yuanmf.springcloud.entity.Payment;
import com.yuanmf.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if (result>0){
            return new CommonResult(200,"成功serverPort: "+serverPort);
        }else {
            return new CommonResult(444,"失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (payment!=null){
            return new CommonResult(200,"成功serverPort: "+serverPort,payment);
        }else {
            return new CommonResult(444,"失败");
        }
    }

    @RequestMapping(value = "/payment/zk")
    public String paymentZk(){
        return "springcloud with zookeeper: "+ serverPort + "\t" + UUID.randomUUID().toString();
    }
}
