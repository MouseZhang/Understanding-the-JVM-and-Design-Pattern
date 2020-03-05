package java.lang;

public class String {
    /*
        双亲委派机制可以保证代码安全性
        通过APP-->EXC-->BOOT（最终执行）
        调用过程：
            1、类加载器收到请求
            2、将这个请求向上委托给父类加载器去完成，一直向上委托直到启动类加载器
            3、启动类加载器检查是否能够加载当前的类，能加载就使用当前加载器进行加载并结束；否则抛出异常，通知子加载器加载
            4、重复步骤3
            Class Not Found
            启动(根)加载器为null，是因为Java调用不到C、C++
            Java = C++--
     */
    public String toString() {
        return "hello";
    }

    public static void main(String[] args) {
        String str = new String();
        System.out.println(str.getClass().getClassLoader());
        System.out.println(str.toString());
    }
}
