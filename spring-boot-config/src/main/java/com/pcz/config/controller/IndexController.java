package com.pcz.config.controller;

import com.pcz.config.bean.BlogProperties;
import com.pcz.config.bean.ConfigBean;
import com.pcz.config.bean.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author picongzhi
 */
@RestController
public class IndexController {
    @Autowired
    private BlogProperties blogProperties;

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private TestConfigBean testConfigBean;

    @GetMapping("/")
    String index() {
        return blogProperties.getName() + ", " + blogProperties.getTitle();
    }

    @GetMapping("/config")
    String config() {
        return "name: " + configBean.getName() +
                ", title: " + configBean.getTitle() +
                ", whole title: " + configBean.getWholeTitle();
    }

    @GetMapping("/test")
    String test() {
        return testConfigBean.getName() + ", " + testConfigBean.getAge();
    }
}
