package cn.ustb;

public class HeapOptDemo {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();// 返回JVM可以使用的最大内存
        long totalMemory = Runtime.getRuntime().totalMemory();// 返回JVM的总内存
        /*
            默认情况下，初始化内存占本机的1/64，可使用的最大内存占本机的1/4
         */
        System.out.println("JVM可使用的最大内存为：" + maxMemory + "字节，约为" + (maxMemory/(double)1024/1024) + "MB");
        System.out.println("JVM的总内存为：" + maxMemory + "字节，约为" + (totalMemory/(double)1024/1024) + "MB");
    }
}
