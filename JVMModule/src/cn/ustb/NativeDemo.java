package cn.ustb;

public class NativeDemo {
    public static void main(String[] args) {
        new Thread(()->{

        }, "myThread").start();
    }

    /*
        1、凡是带有native关键字，就说明Java的范围达不到了，调用的是底层C语言的库；
        2、它会进入本地方法栈，会调用JNI接口，从而调用本地方法库，来扩展Java的使用；
        3、本地方法接口，JNI(Java Native Interface)；
        4、JNI的作用：扩展Java的使用，融合不同的编程语言为Java所用；
        5、Java在内存区域中专门开辟了一块标记区域：Native Method Stack来登记native方法；
        6、在最终执行的时候，通过JNI加载本地方法库中的方法，例如Java程序驱动打印机。
     */
    private native void start0();

}
