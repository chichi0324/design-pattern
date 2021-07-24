package generate.singletonPattern.subclass;

public class HotterSingleton extends Singleton {
  
  protected static Singleton uniqueInstance;
  
  private HotterSingleton() {
    super();
  }
}