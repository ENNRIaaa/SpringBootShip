package net.pjsk.demo.util;

import cn.hutool.core.util.ObjectUtil;
import net.pjsk.demo.domain.Result;

/**
 * 封装接口返回方法
 *
 * @author liyan
 * @date 2021.2.19
 */
public class ResultUtil {

    /**
     * 成功
     *
     * @param data
     * @return
     */
    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("SUCCESS");
        if (data != null) {
            result.setData(data);
        }
        return result;
    }

    /**
     * 成功(无需返回数据)
     *
     * @return
     */
    public static Result success() {
        return success(null);
    }

    /**
     * 失败
     *
     * @param code
     * @param message
     * @return
     */
    public static Result error(Integer code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
