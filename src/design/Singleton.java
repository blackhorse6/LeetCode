package design;

/**
 * User          : zhouchenbin
 * Date          : 2020-11-04
 * ----      Title           ----
 * 单例模式
 * https://juejin.cn/post/6844903782187270151
 * ----      Description     ----
 * 1 饿汉式
 * 2 懒汉式【线程安全】
 * 3 双重检索模式【DCL】
 * 4 静态内部类
 * 5 枚举
 * ----      Example         ----
 */
public class Singleton {

    private static Singleton instance = new Singleton();
    private static Singleton instance2 = null;
    private static volatile Singleton instance3 = null;
    private static Singleton instance4 = null;

    public static void main(String[] args) {

    }

    private Singleton() {
    }

    /**
     * 1 内存浪费
     *
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }

    /**
     * 2  增加不必要的锁开销
     *
     * @return
     */
    public static synchronized Singleton getInstance2() {
        if (instance2 == null) {
            instance2 = new Singleton();
        }
        return instance2;
    }

    /**
     * 3 一定程度上解决了内存浪费，锁开销，线程安全问题，但偶尔也会出问题
     * instance3 = new Singleton()实际上执行了3步指令
     * 1）为instance3分配内存空间
     * 2）调用Singleton构造函数，初始化
     * 3）将instance3对象指向分配的内存空间，此时instance3不再为空
     * 由于指令重排，可能执行123或者132
     *
     * @return
     */
    public static Singleton getInstance3() {
        if (instance3 == null) {
            synchronized (Singleton.class) {
                if (instance3 == null) {
                    instance3 = new Singleton();
                }
            }
        }
        return instance3;
    }

    /**
     * 4
     * @return
     */
    public static Singleton getInstance4() {

        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }


}
