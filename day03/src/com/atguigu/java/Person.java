package com.atguigu.java;

/**
 * @author yvonne
 * @create 2021-10-13 14:22
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void show() {
        System.out.println("你好我是一个好人");
    }

    private String showNation(String nation) {
        System.out.println("我是" + nation);
        return nation.toString();
    }
}
