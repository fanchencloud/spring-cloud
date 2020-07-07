package cn.fanchencloud.springcloud.controller;

import cn.fanchencloud.springcloud.common.ResponseResult;
import cn.fanchencloud.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/7/7
 * Time: 20:33
 * Description:
 *
 * @author chen
 */
@Slf4j
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    private static final String PAYMENT_URL = "http://192.168.1.118:8001";

    /**
     * 注入访问 Rest 的模板
     */
    private RestTemplate restTemplate;

    /**
     * 提交支付信息
     *
     * @param payment 支付信息
     * @return 提交结果
     */
    @PostMapping(value = "/save")
    public ResponseResult save(Payment payment) {
        log.info("payment = " + payment);
        return restTemplate.postForObject(PAYMENT_URL + "/payment/save", payment, ResponseResult.class);
    }

    /**
     * 根据id查询支付信息
     *
     * @param id id
     * @return 支付信息
     */
    @GetMapping(value = "/search/{id}")
    public ResponseResult search(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/search/" + id, ResponseResult.class);
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
