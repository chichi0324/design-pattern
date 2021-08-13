package structure.facadePattern;

public class CarWorkFacade {

    public static void main(String args[]){
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        carEngineFacade.stopEngine();
    }
}
