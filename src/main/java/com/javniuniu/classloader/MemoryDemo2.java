package com.javniuniu.classloader;


import java.util.ArrayList;

// -Xms1m 设置初始化内存分配大小  默认 1/64
// -Xmx8m 设置最大分配内存       默认 1/4
// -XX:+PrintGCDetails         打印GC垃圾回收信息
// -XX:+HeapOnOutOfMemoryError OOM DUMP

// -Xms1m -Xmx8m -XX:+HeapOnOutOfMemoryError
public class MemoryDemo2 {
    byte[] bytes = new byte[1024*1024];//1M

    public static void main(String[] args) {
        ArrayList<MemoryDemo2> list = new ArrayList<>();
        int count = 0;

        try {
            while(true) {
                list.add(new MemoryDemo2());
                count ++;
            }
        } catch (Error e) {
            System.out.println(count);
            e.printStackTrace();
        }
    }
}
