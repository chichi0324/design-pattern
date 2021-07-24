package generate.singletonPattern.factoryDemo;


/**
 * 巧克力鍋爐，把巧克力和牛奶融在一起
 * <br></>巧克力鍋爐只有一個
 */
public class ChocolateBoiler {

  private boolean empty;
  private boolean boiled; //煮沸

  // 利用一個靜態變數紀錄ChocolateBoiler類別的實體
  private static ChocolateBoiler chocolateBoiler;

  private ChocolateBoiler() {
    this.empty = true;
    this.boiled = false;
  }

  // 用 getInstance() 方法實體化ChocolateBoiler物件，並傳回這個實體
  public static ChocolateBoiler getInstance() {
    if (chocolateBoiler == null) {
      chocolateBoiler = new ChocolateBoiler();
    }
    return chocolateBoiler;
  }

  private void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
      // 在鍋爐內填滿巧克力和牛奶的混合物
    }
  }

  private void drain() {
    if (!isEmpty() && isBoiled()) {
      // 排出煮沸的巧克力和牛奶
      empty = true;
    }
  }

  private void boil() {
    if (!isEmpty() && !isBoiled()) {
      // 將內容物煮沸
      boiled = true;
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
}
