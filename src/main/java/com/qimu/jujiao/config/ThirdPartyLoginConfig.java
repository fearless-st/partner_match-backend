package com.qimu.jujiao.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 第三方登录配置类
 */
@Configuration
@ConfigurationProperties(prefix = "third.config")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThirdPartyLoginConfig {
    private Integer appId;
    private String appKey;
    private String redirectUrl;

    @Bean
    public ThirdPartyLoginConfig getConfig() {
        return new ThirdPartyLoginConfig(appId, appKey, redirectUrl);
    }
}
