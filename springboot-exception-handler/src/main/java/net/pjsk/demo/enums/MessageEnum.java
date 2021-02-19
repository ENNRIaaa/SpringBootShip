package net.pjsk.demo.enums;

/**
 * 状态消息枚举
 *
 * @author liyan
 * @date 2021.2.19
 */

public enum MessageEnum {

    SYSTEM_ERROR(1001,"系统错误"),
    NAME_EXCEEDED_CHARRACTER_LIMIT(2000, "姓名超过了限制，最大4个字符!");

    private Integer code;
    private String message;

    MessageEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
