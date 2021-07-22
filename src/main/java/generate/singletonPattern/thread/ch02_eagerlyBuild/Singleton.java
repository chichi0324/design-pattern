package generate.singletonPattern.thread.ch02_eagerlyBuild;

/**
 * 改善多執行緒
 * <br></>「率先」建立實體，而不用拖延實體化做法
 */
public class Singleton {

  // 在靜態初始化方法中建立獨體．這段程式碼在執行緒中保證安全
  // 在JVM在載入此類別時，馬上建立此唯一的獨體物件
  private static Singleton uniqueInstance = new Singleton();
  
  private Singleton() {}
  
  public static Singleton getInstance() {
    // 已經有實體了，直接使用它
    return uniqueInstance;
  }
}

/* 
    If your application always creates and uses an instance of the Singleton
    or the overhead of creation and runtime aspects of the Singleton are not
    onerous, this can create your Singleton eagerly.
*/
