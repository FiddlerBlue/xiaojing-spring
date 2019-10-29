package com.xiaojing.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 11:38 PM
 **/
public class TestGetBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person bean = (Person) ctx.getBean("person");
        bean.setFirstName("Xiaojing");
        bean.setAge(29);
        bean.setLastName("Zhao");
        bean.setGender("Female");
        System.out.println(bean.getFirstName() + "\t" + bean.getLastName() + "\t"
        + bean.getAge() + "\t" + bean.getGender());
        System.out.println(bean);
    }
}
