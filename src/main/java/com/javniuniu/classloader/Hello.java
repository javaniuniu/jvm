package com.javniuniu.classloader;

import java.util.Random;

// -Xms8m -Xmx8m -XX:+PrintGCDetails
public class Hello {
    public static void main(String[] args) {
        String str = "javaniuniujavaniuniu";
        while (true) {
            str += str + new Random().nextInt(999999999) + new Random().nextInt(999999999);
        }
        /**
         * [GC (Allocation Failure) [PSYoungGen: 1516K->482K(2048K)] 1516K->522K(7680K), 0.0010070 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         * [GC (Allocation Failure) [PSYoungGen: 1839K->487K(2048K)] 1879K->735K(7680K), 0.0010057 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         * [GC (Allocation Failure) [PSYoungGen: 1747K->511K(2048K)] 1995K->879K(7680K), 0.0007348 secs] [Times: user=0.01 sys=0.01, real=0.00 secs]
         * [GC (Allocation Failure) [PSYoungGen: 1462K->320K(2048K)] 3043K->2205K(7680K), 0.0006422 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         * [Full GC (Ergonomics) [PSYoungGen: 1675K->0K(2048K)] [ParOldGen: 5526K->3403K(5632K)] 7202K->3403K(7680K), [Metaspace: 3037K->3037K(1056768K)], 0.0049794 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
         * [GC (Allocation Failure) --[PSYoungGen: 1283K->1283K(2048K)] 5901K->5901K(7680K), 0.0009396 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         * [Full GC (Ergonomics) [PSYoungGen: 1283K->0K(2048K)] [ParOldGen: 4617K->2797K(5632K)] 5901K->2797K(7680K), [Metaspace: 3044K->3044K(1056768K)], 0.0038085 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
         * [GC (Allocation Failure) [PSYoungGen: 37K->96K(2048K)] 5262K->5321K(7680K), 0.0006763 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         * [Full GC (Ergonomics) [PSYoungGen: 96K->0K(2048K)] [ParOldGen: 5225K->4011K(5632K)] 5321K->4011K(7680K), [Metaspace: 3054K->3054K(1056768K)], 0.0040039 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
         * [GC (Allocation Failure) [PSYoungGen: 0K->0K(2048K)] 4011K->4011K(7680K), 0.0004621 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
         * [Full GC (Allocation Failure) [PSYoungGen: 0K->0K(2048K)] [ParOldGen: 4011K->3992K(5632K)] 4011K->3992K(7680K), [Metaspace: 3054K->3054K(1056768K)], 0.0040195 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
         * Heap
         *  PSYoungGen      total 2048K, used 65K [0x00000007bfd80000, 0x00000007c0000000, 0x00000007c0000000)
         *   eden space 1536K, 4% used [0x00000007bfd80000,0x00000007bfd90790,0x00000007bff00000)
         *   from space 512K, 0% used [0x00000007bff80000,0x00000007bff80000,0x00000007c0000000)
         *   to   space 512K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007bff80000)
         *  ParOldGen       total 5632K, used 3992K [0x00000007bf800000, 0x00000007bfd80000, 0x00000007bfd80000)
         *   object space 5632K, 70% used [0x00000007bf800000,0x00000007bfbe6178,0x00000007bfd80000)
         *  Metaspace       used 3110K, capacity 4496K, committed 4864K, reserved 1056768K
         *   class space    used 338K, capacity 388K, committed 512K, reserved 1048576K
         * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
         * 	at java.util.Arrays.copyOf(Arrays.java:3332)
         * 	at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
         * 	at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:674)
         * 	at java.lang.StringBuilder.append(StringBuilder.java:208)
         * 	at com.javniuniu.classloader.Hello.main(Hello.java:12)
         *
         * Process finished with exit code 1
         *
         */
    }
}
