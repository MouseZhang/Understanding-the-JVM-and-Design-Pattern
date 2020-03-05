package cn.ustb;

public class Car {
    public static void main(String[] args) {
        // 类是模板，对象是具体
        Car carA = new Car();
        Car carB = new Car();
        Car carC = new Car();
        System.out.println("carA的HashCode：" + carA.hashCode());
        System.out.println("carB的HashCode：" + carB.hashCode());
        System.out.println("carC的HashCode：" + carC.hashCode());

        Class<? extends Car> carAClass = carA.getClass();
        Class<? extends Car> carBClass = carB.getClass();
        Class<? extends Car> carCClass = carC.getClass();
        System.out.println("carAClass的HashCode：" + carAClass.hashCode());
        System.out.println("carBClass的HashCode：" + carBClass.hashCode());
        System.out.println("carCClass的HashCode：" + carCClass.hashCode());

        ClassLoader classLoader = carAClass.getClassLoader();
        System.out.println("应用程序加载器：" + classLoader); // AppClassLoader
        System.out.println("扩展类加载器：" + classLoader.getParent()); // ExtClassLoader，存在于/jre/lib/ext中
        System.out.println("启动类(根)加载器：" + classLoader.getParent().getParent()); // Java程序获取不到 rt.jar中
    }
}
