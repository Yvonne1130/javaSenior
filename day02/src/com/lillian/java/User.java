package com.lillian.java;

/**
 * @author yvonne
 * @create 2021-10-11 14:26
 * 定义一个 User 类：
 *  * 该类包含：private 成员变量（int 类型） id，age；（String 类型）name。
 *  * 定义一个测试类：
 *  * 创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
 *  * 使用 Junit 单元测试类进行测试。
 */
public class User {

    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

