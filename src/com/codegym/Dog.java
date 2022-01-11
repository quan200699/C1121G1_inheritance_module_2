package com.codegym;

public class Dog extends Animal {
    private String type;

    public Dog() {
//        super();//Hàm tạo không tham số của lớp cha
    }

    public Dog(String type) {
        this(); //Hàm tạo của lớp hiện tại => Dog();
        this.type = type;
    }

    public Dog(double weight, int age, String sex, String type) {
        super(weight, age, sex);//Hàm tạo có 3 tham số của lớp cha
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    void eat() {
        System.out.println("Chó ăn cơm");
    }

    @Override
    public String toString() {
        return super.getWeight() + ", " + super.getAge() + ", " + super.getSex() + ", " + this.type;
    }

    public void bark() {
        System.out.println("Chó đang sủa");
    }
}
