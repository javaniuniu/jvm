package com.javniuniu.classloader;


public class MemoryDemo {
    public static void main(String[] args) {
        // 返回jvm运行时最大内存
        long maxMemory = Runtime.getRuntime().maxMemory();
        // 返回jvm初始化总内存
        long totalMemory = Runtime.getRuntime().totalMemory();

        System.out.println("max= "+maxMemory+" 字节 "+maxMemory/1024/1024+"M");
        System.out.println("total= "+maxMemory+" 字节 "+totalMemory/1024/1024+"M");

        // 当出现 OOM 异常
            // 1、尝试扩大内存看几多
            // 2、分析内存，看一下哪个地方出现类问题（专业工具）

        // GC 调优命令
        // -Xms1024m -Xmx1024m -XX:+PrintGCDetails

        /**
         * max= 1029177344 字节 981M
         * total= 1029177344 字节 981M
         * Heap
         *  PSYoungGen      total 305664K, used 15729K [0x00000007aab00000, 0x00000007c0000000, 0x00000007c0000000)
         *   eden space 262144K, 6% used [0x00000007aab00000,0x00000007aba5c420,0x00000007bab00000)
         *   from space 43520K, 0% used [0x00000007bd580000,0x00000007bd580000,0x00000007c0000000)
         *   to   space 43520K, 0% used [0x00000007bab00000,0x00000007bab00000,0x00000007bd580000)
         *  ParOldGen       total 699392K, used 0K [0x0000000780000000, 0x00000007aab00000, 0x00000007aab00000)
         *   object space 699392K, 0% used [0x0000000780000000,0x0000000780000000,0x00000007aab00000)
         *  Metaspace       used 2954K, capacity 4496K, committed 4864K, reserved 1056768K
         *   class space    used 322K, capacity 388K, committed 512K, reserved 1048576K
         *
         * Process finished with exit code 0
         */
    }
}
