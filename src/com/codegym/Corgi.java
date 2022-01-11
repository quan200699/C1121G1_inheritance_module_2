package com.codegym;

public class Corgi extends Dog {
    private String name;

    public void run() {
        System.out.println("Chó đang chạy");
    }

    public void run(String name) { //Nạp chồng phương thức run()
        System.out.println(name + " đang chạy");
    }

    public String run(int age) {
        return "Chó đang chạy được " + age + " tuổi";
    }
}
