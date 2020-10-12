package jvm;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-24
 * ----      Title           ----
 * https://zhuanlan.zhihu.com/p/63473935
 * ----      Description     ----
 * ----      Example         ----
 */
public class StaticTest {
    public static void main(String[] args) throws ClassNotFoundException {
//        System.out.println(Static.name);
//        Class clazz = Static.class; //不输出
        Class.forName("jvm.Static"); //输出 静态代码块zhou

    }
}

class Static {
    public static String name = "zhou";

    static {
        System.out.println("静态代码块" + name);
    }

    public Static() {
        System.out.println("构造函数");
    }

}