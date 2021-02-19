package net.pjsk.demo.controller;

import net.pjsk.demo.dao.UserDao;
import net.pjsk.demo.domain.Result;
import net.pjsk.demo.domain.User;
import net.pjsk.demo.enums.MessageEnum;
import net.pjsk.demo.exception.UserException;
import net.pjsk.demo.util.ResultUtil;
import org.springframework.web.bind.annotation.*;

/**
 * @author liyan
 * @date 2021.2.19
 */
@RequestMapping("/user")
@RestController
public class UserController {

    /**
     * 获取用户列表
     *
     * @param exception
     * @return
     */
    @GetMapping("/{exception}")
    public Result<?> getUserList(@PathVariable("exception") Boolean exception) {
        if (exception) {
            // 手动设置一个除零异常
            int a = 1 / 0;
        }
        return ResultUtil.success(UserDao.getUserList());
    }

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    @PostMapping
    public Result<?> addUser(@RequestBody User user) {
        if (user.getName().length() > 4) {
            throw new UserException(MessageEnum.NAME_EXCEEDED_CHARRACTER_LIMIT);
        }
        UserDao.add(user);
        return ResultUtil.success();
    }

}
