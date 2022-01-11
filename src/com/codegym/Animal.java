package com.codegym;

//Lớp động vật
public class Animal {
    private double weight;
    private int age;
    private String sex;

    public Animal() {
    }

    public Animal(double weight, int age, String sex) {
        this.weight = weight;
        this.age = age;
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    void eat() {
        System.out.println("Đăng ăn");
    }

    @Override
    public String toString() { //PT toString là một pt có sẵn của lớp Object
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
