package com.atguigu.java;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author yvonne
 * @create 2021-10-13 14:28
 */
public class ReflectionTest {
    @Test
    public void testField() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class clazz = Person.class;

        Person p = (Person) clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);

        name.set(p, "Tom");
        System.out.println(name.get(p));
    }


}
