package cn.fanchencloud.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/7/6
 * Time: 23:14
 * Description: 订单实体类
 *
 * @author chen
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
