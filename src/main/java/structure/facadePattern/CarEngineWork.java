package structure.facadePattern;


/*
* 門面模式、表象模式、外觀模式:當一個系統擁有多個子系統時，將複數子系統包裝起來
* 對外統一由一個窗口負責被呼叫，就像一個總機接到使用者需求後，負責轉接至其他窗口
* 來負責，以下以一個汽車引擎發動舉例
*
*
* */
public class CarEngineWork {

    private static int DEFAULT_COOLING_TEMP = 90;
    private static int MAX_ALLOWED_TEMP = 50;


    public static void main(String[] arg){

        AirFlowController airFlowController = new AirFlowController();
        FuelInjector fuelInjector = new FuelInjector();
        Starter starter = new Starter();
        CoolingController coolingController = new CoolingController();
        CatalyticConverter catalyticConverter = new CatalyticConverter();

        //汽車發動
        System.out.println("car launch ======");
        airFlowController.takeAir();
        fuelInjector.on();
        fuelInjector.inject();
        starter.start();
        coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
        coolingController.run();
        catalyticConverter.on();

        //汽車熄火
        System.out.println("car stop ======");
        fuelInjector.off();
        catalyticConverter.off();
        coolingController.cool(MAX_ALLOWED_TEMP);
        coolingController.stop();
        airFlowController.off();
    }


}
