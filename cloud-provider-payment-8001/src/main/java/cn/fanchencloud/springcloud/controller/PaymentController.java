package cn.fanchencloud.springcloud.controller;

import cn.fanchencloud.springcloud.common.ResponseResult;
import cn.fanchencloud.springcloud.entity.Payment;
import cn.fanchencloud.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/7/6
 * Time: 23:35
 * Description:
 *
 * @author chen
 */
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    /**
     * 注入支付服务
     */
    private PaymentService paymentService;

    @PostMapping(value = "/save")
    public ResponseResult save(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }

    @GetMapping(value = "/search/{id}")
    public ResponseResult search(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
