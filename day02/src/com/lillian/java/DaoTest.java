package com.lillian.java;
import org.junit.Test;

import java.util.List;

/**
 * @author yvonne
 * @create 2021-10-11 14:27
 * 定义一个测试类：
 *  * 创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
 *  * 使用 Junit 单元测试类进行测试。
 */
public class DaoTest {
    @Test
     public void test(){

        DAO<User> dao = new DAO<User>();
        dao.save("1001" ,new User(100,43,"周杰伦"));
        dao.save("1002" ,new User(101,42,"1杰伦"));
        dao.save("1003" ,new User(102,23,"2杰伦"));
        dao.save("1004" ,new User(103,53,"3杰伦"));
        dao.save("1005" ,new User(104,13,"4杰伦"));
        User user = dao.get("1003");
        System.out.println(user);
        dao.update("1001", new User(124, 24, "xixi"));
        dao.delete("1003");
        List list = dao.list();
        list.forEach(System.out::println);
    }
}
