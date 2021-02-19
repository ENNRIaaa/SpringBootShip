package net.pjsk.demo.domain;

import lombok.Data;

/**
 * 接口返回数据模型
 *
 * @author liyan
 * @date 2021.2.19
 */
@Data
public class Result<T> {

    private Integer code;

    private String message;

    private T data;
}
