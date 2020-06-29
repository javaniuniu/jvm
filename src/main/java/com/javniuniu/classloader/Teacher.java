package com.javniuniu.classloader;


public class Teacher {
    private int id;
    private String name = "niu";

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.id = 001;
        teacher1.name = "min1";

        Teacher teacher2 = new Teacher();
        teacher2.id = 002;
        teacher2.name = "min2";
    }
}
