package cn.ustb;

import java.util.ArrayList;
import java.util.List;

// -Xms1m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
public class HeapDumpDemo {

    byte[] array = new byte[1*1024*1024]; // 1MB

    public static void main(String[] args) {
        List<HeapDumpDemo> list = new ArrayList<>();
        int count = 0; // 用于记录代码出错的行数
        try {
            while (true) {
                list.add(new HeapDumpDemo());
                count++;
            }
        } catch (Error e) {
            System.out.println("count = " + count);
            e.printStackTrace();
        }
    }
}
