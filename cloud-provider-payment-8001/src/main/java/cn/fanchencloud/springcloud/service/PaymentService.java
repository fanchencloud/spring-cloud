package cn.fanchencloud.springcloud.service;

import cn.fanchencloud.springcloud.common.ResponseResult;
import cn.fanchencloud.springcloud.entity.Payment;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/7/6
 * Time: 23:31
 * Description:
 *
 * @author chen
 */
public interface PaymentService {
    /**
     * 保存支付信息
     *
     * @param payment 支付信息
     * @return 操作影响记录
     */
    ResponseResult save(Payment payment);

    /**
     * 根据 id 查询记录
     *
     * @param id id
     * @return 记录
     */
    ResponseResult getPaymentById(Long id);
}
