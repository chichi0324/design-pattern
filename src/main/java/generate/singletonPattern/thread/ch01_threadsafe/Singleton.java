package generate.singletonPattern.thread.ch01_threadsafe;

/**
 * 改善多執行緒
 * <br></>把getInstance()變成同步化(synchronized)的方法
 */
public class Singleton {
  
  private static Singleton uniqueInstance;
  
  private Singleton() {}

  // 增加 synchronized 關鍵字到 getInstance()方法修飾一下，迫使執行緒進入此方法之前，
  // 要先等候別的執行緒離開此方法．也就是說，沒有兩個執行緒可以同時進入兩個方法
  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
}

/* 
    Synchronization is expensive and there is totally 
    unneeded overhead after the first time through.
*/
// 缺點：只有第一次產生實體會需要同步化，但如果每次都同步化可能造成執行效率下降100倍，如果
// getInstance()放在頻繁運作的地方，可能要重新考慮了.