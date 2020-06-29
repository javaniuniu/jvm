package com.javniuniu.classloader;

/**
 *
 */
public class Student {

    public String toString() {
        return "hello";
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getClass().getClassLoader()); // AppClassLoader
        System.out.println(student.toString());

    }
}
