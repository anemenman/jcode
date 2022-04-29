package jcode.ch_05_multithreading.q_36_double_checked_locking_singleton;

public class DoubleCheckedLockingSingleton_01 {
}

/**
 * + Ленивая инициализация
 * + Высокая производительность
 * - Поддерживается только с JDK 1.5 [5]
 */
class Singleton {
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // private constructor and other methods...
}
