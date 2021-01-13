package com.wcj.framework.test;

import com.wcj.framework.helper.BeanHelper;
import com.wcj.framework.pojo.Person;

public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.wcj.framework.helper.IocHelper");
        Person person=BeanHelper.getBean(Person.class);
        System.out.println(person);
    }
}
