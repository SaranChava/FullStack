package com.springClass;


public class Coder {
    int age;
    private Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Coder(){
        System.out.println("Coder object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Assigning age as 12 by default");
        this.age = age;
    }

    public void code(){
        System.out.println("Here we go!!");
        com.compile();
    }
}
