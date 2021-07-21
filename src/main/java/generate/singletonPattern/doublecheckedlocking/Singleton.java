package generate.singletonPattern.doublecheckedlocking;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

public class Singleton {
  
  private volatile static Singleton uniqueInstance;
  
  private Singleton() {}
  
  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      synchronized (Single.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new Singleton();
        }
      }
    }
    return uniqueInstance;
  }


}

// Only synchronize the first time through.