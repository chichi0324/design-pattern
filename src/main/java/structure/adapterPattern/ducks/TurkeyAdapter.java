package structure.adapterPattern.ducks;

/**
 * 火雞轉接器，將火雞轉介成鴨子
 */
//實踐Duck介面
public class TurkeyAdapter implements Duck {
  Turkey turkey;

  // 「被轉接者」物件參考，由建構式建立
  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  // 實踐介面中的方法，調用gobble()
  public void quack() {
    turkey.gobble();
  }

  // 雖然兩個介面都具備fly()，火雞的飛行距離很短，不像鴨子可以長途飛行，所以必須連續呼叫五次火雞的fly()
  public void fly() {
    for (int i = 0; i < 5; i++) {
      turkey.fly();
    }
  }
}