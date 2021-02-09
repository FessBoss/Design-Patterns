package Example2;

import Example1.Singleton;

public class ConcurrentSingleton {
    private volatile static ConcurrentSingleton uniqueInstance;

    private ConcurrentSingleton() { }

    public static ConcurrentSingleton getInstance() {
       if (uniqueInstance == null) {
           synchronized (Singleton.class) {
               if (uniqueInstance == null) {
                   uniqueInstance = new ConcurrentSingleton();
               }
           }
       }
       return uniqueInstance;
    }
}
