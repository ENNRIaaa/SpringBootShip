package net.pjsk.demo.dao;

import net.pjsk.demo.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟数据库
 *
 * @author liyan
 * @date 2021.2.19
 */
public class UserDao {

    /**
     * User表
     */
    private static List<User> userList = new ArrayList();

    static {
        userList.add(new User(1L, "李达康", 0));
        userList.add(new User(2L, "赵东来", 0));
        userList.add(new User(3L, "张树立", 0));
    }

    public static boolean add(User user) {
        return userList.add(user);
    }

    public static List<User> getUserList() {
        return userList;
    }
}
