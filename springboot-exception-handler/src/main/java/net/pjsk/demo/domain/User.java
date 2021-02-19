package net.pjsk.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户实体
 *
 * @author liyan
 * @date 2021.2.19
 */
@Data
@AllArgsConstructor
public class User {

    /**
     * id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别(0男 1女)
     */
    private Integer gender;
}
