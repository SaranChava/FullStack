package org.example;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;

    private String lastName;

    private String id;

    private int age;

    public Student() {

    }

    public Student(String name, String lastName, String id, int age) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
