package com.pcz.config.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author picongzhi
 */
@Data
@ConfigurationProperties(prefix = "pcz.blog")
@Component
public class ConfigBean {
    private String name;
    private String title;
    private String wholeTitle;
}
