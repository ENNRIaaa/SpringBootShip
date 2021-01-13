package com.shiguangping.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 示例Service
 *
 * @author liyan
 * @since 2021.1.13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleService {

    private String prefix;

    private String suffix;

    /**
     * 拼装字符串
     *
     * @param word
     * @return
     */
    public String wrap(String word) {
        return prefix + word + suffix;
    }
}
