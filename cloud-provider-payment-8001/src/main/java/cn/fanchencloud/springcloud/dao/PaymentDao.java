package cn.fanchencloud.springcloud.dao;

import cn.fanchencloud.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/7/6
 * Time: 23:21
 * Description: 支付持久化
 *
 * @author chen
 */
@Mapper
public interface PaymentDao {
    /**
     * 保存支付信息到数据库
     *
     * @param payment 支付信息
     * @return 操作影响记录
     */
    int save(Payment payment);

    /**
     * 根据 id 查询记录
     *
     * @param id id
     * @return 记录
     */
    Payment getPaymentById(@Param("id") Long id);
}
