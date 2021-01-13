package com.shiguangping.configure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性
 *
 * @author liyan
 * @since 2021.1.13
 */
@Data
@ConfigurationProperties(prefix = "example.service")
public class ExampleServiceProperties {

    private String prefix;

    private String suffix;
}
