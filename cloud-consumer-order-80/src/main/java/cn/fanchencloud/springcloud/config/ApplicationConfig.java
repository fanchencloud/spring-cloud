package cn.fanchencloud.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/7/7
 * Time: 20:36
 * Description:
 *
 * @author chen
 */
@Configuration
public class ApplicationConfig {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
