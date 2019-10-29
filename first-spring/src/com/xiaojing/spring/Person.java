package com.xiaojing.spring;

/**
 * @author Xiaojing
 * @create 10/2/2019
 * @desc Created by Xiaojing at 11:39 PM
 **/
public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    public Person(){

    }

    public Person(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
