package generate.singletonPattern.thread.ch03_doublecheckedlocking;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * 改善多執行緒
 * <br></>利用「雙重檢查上鎖」在getInstance()中減少使用同步化
 * <br></>如果尚未建立實體，「才」進行同步化，只有第一次會同步化
 */
public class Singleton {

  // volatile關鍵字確保：當uniqueInstance變數被初始化成Singleton實體時，
  // 多執行緒處理uniqueInstance變數的做法是正確的
  private volatile static Singleton uniqueInstance;
  
  private Singleton() {}

  public static Singleton getInstance() {
    // 檢查實體，如果不存在，就進入同步化區塊
    if (uniqueInstance == null) {
      // 注意，只有第一次才執行這裡的程式碼
      synchronized (XsiNilLoader.Single.class) {
        // 進入區塊後，再檢查一次，如果仍是null，才建立實體
        if (uniqueInstance == null) {
          uniqueInstance = new Singleton();
        }
      }
    }
    return uniqueInstance;
  }


}

// Only synchronize the first time through.