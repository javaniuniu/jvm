package java.lang;


public class String {
    /**
     * 双亲委派机制：安全
     * 1、APP --> EXT --> BOOT(最终执行)
     * BOOT
     * EXC
     * APP
     */

    @Override
    public String toString() {
        return "hello";
    }

    public static void main(String[] args) {
        String str = new String();
        str.toString();
        /**
         * Error: Main method not found in class java.lang.String, please define the main method as:
         *    public static void main(String[] args)
         * or a JavaFX application class must extend javafx.application.Application
         */
    }

    /**
     * 1、类加载器收到类加载器的请求
     * 2、将这个请求向上委托给父类加载器区完成，一直向上委托，直到启动类加载器
     * 3、启动加载器检查是否能够加载当前这个类，能加载就结束，使用当前的类加载器，否则，抛出一次，通知子加载器进行加载
     * 4、重复步骤3
     *
     * 如果都找不到 Class Not Found
     */
}
