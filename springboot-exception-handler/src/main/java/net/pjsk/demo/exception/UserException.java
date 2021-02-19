package net.pjsk.demo.exception;

import net.pjsk.demo.enums.MessageEnum;

/**
 * 自定义异常类
 *
 * @author liyan
 * @date 2021.2.19
 */
public class UserException extends RuntimeException{

    private Integer code;

    public UserException(MessageEnum messageEnum){
        super(messageEnum.getMessage());
        this.code = messageEnum.getCode();
    }

    public Integer getCode(){
        return code;
    }

    public void setCode(Integer code){
        this.code = code;
    }
}
