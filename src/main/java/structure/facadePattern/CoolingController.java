package structure.facadePattern;

public class CoolingController {

    public void setTemperatureUpperLimit(int DEFAULT_COOLING_TEMP){
        System.out.println("CoolingController on");
    }

    public void run(){
        System.out.println("CoolingController run");
    }

    public void cool(int MAX_ALLOWED_TEMP){
        System.out.println("CoolingController cool");
    }

    public void stop(){
        System.out.println("CoolingController stop");
    }
}
