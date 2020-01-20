package com.pcz.config;

import com.pcz.config.bean.ConfigBean;
import com.pcz.config.bean.TestConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author picongzhi
 */
@SpringBootApplication

//@EnableConfigurationProperties({ConfigBean.class, TestConfigBean.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
