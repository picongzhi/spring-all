package com.pcz.config.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author picongzhi
 */
@Data
@Component
public class BlogProperties {
    @Value("pcz's blog")
    private String name;

    @Value("spring boot")
    private String title;
}
