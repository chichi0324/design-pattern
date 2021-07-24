package generate.singletonPattern.classic;

/**
 * 經典的獨體模式設計
 */
public class Singleton {

  // 利用一個靜態變數紀錄Singleton類別的實體
  private static Singleton uniqueInstance;

  // 把建構式宣告為私有的，只有自Singleton類別內才可以呼叫建構式
  private Singleton() {}

  // 用 getInstance() 方法實體化物件，並傳回這個實體
  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
}

// 缺點：Not thread safe.
// 若同時有兩個執行緒執行getInstance()有可能回傳兩個Singleton實體
