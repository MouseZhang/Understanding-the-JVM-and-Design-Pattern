package cn.ustb;

import java.util.Random;

// -Xms8m -Xmx8m -XX:+PrintGCDetails
public class HeapDemo {
    public static void main(String[] args) {
        String str = "Hello World!!!";
        while (true) {
            str += str + new Random().nextInt(888888888) + new Random().nextInt(888888888);
        }
    }
}
