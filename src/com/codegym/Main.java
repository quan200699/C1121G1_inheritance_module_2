package com.codegym;

public class Main {

    public static void main(String[] args) {
        //Quản lý 5 con mèo và 5 con chó
        //1 mảng lưu trữ 5 con mèo Cat[] cats = new Cat[5]
        //1 mảng lưu trữ 5 con chó Dog[] dogs = new Dog[5]
        //Hiển thị tất cả các con vật đang có trong dự án
        Animal[] animals = new Animal[10];
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                animals[i] = new Dog(); //Upcasting
            } else {
                animals[i] = new Cat(); //Upcasting
            }
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog) {//instanceof là toán tử được sử dụng để kiểm tra KDL của tham chiếu
                ((Dog) animals[i]).bark(); //Sử dụng DownCasting
            } else if (animals[i] instanceof Cat) {
                ((Cat) animals[i]).meow();
            }
        }
        Animal dog = new Dog();
        dog.eat(); //Chó ăn cơm
    }
}
