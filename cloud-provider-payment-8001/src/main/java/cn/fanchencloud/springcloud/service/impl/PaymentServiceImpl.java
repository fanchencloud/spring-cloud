package cn.fanchencloud.springcloud.service.impl;

import cn.fanchencloud.springcloud.common.ResponseResult;
import cn.fanchencloud.springcloud.dao.PaymentDao;
import cn.fanchencloud.springcloud.entity.Payment;
import cn.fanchencloud.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/7/6
 * Time: 23:32
 * Description:
 *
 * @author chen
 */
@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    /**
     * 注入支付持久层
     */
    private PaymentDao paymentDao;

    @Override
    public ResponseResult save(Payment payment) {
        int save = paymentDao.save(payment);
        log.info("插入结果：" + save);
        if (save > 0) {
            return new ResponseResult(200, "success", save);
        }
        return new ResponseResult(400, "failed");
    }

    @Override
    public ResponseResult getPaymentById(Long id) {
        Payment payment = paymentDao.getPaymentById(id);
        log.info("查询：" + payment);
        if (payment != null) {
            return new ResponseResult(200, "success", payment);
        }
        return new ResponseResult(400, "failed");
    }

    @Autowired
    public void setPaymentDao(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }
}
