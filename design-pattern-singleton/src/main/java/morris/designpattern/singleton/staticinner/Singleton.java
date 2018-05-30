package morris.designpattern.singleton.staticinner;

/**
 * 静态内部类
 * 用classloader机制来保证初始化时只有一个线程
 */
public class Singleton {

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {

    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
