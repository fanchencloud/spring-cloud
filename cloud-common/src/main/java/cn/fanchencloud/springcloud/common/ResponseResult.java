package cn.fanchencloud.springcloud.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/7/6
 * Time: 23:18
 * Description: 封装返回的Json
 *
 * @author chen
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;

    /**
     * 返回的数据
     */
    private T data;

    public ResponseResult(Integer code, String message) {
        this.code = code;
        this.message = message;

    }
}
