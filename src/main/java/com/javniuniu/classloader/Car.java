package com.javniuniu.classloader;

/**
 *
 */
public class Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println(car1.getClass());
        System.out.println(car2.getClass());
        System.out.println(car3.getClass());

        ClassLoader classLoader = car1.getClass().getClassLoader();

        System.out.println(classLoader); // AppClassLoader 应用加载器
        System.out.println(classLoader.getParent()); // ext 扩展类加载器
        System.out.println(classLoader.getParent().getParent()); // null java 程序获取不到


    }
}
