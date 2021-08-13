package generate.abstractFactoryPattern.trainingCamps;

import generate.abstractFactoryPattern.adventurers.Adventurer;
import generate.abstractFactoryPattern.adventurers.Archer;
import generate.abstractFactoryPattern.equipFactory.ArcherEquipFactory;
import generate.abstractFactoryPattern.equipFactory.EquipFactory;

/**
 * 實體工廠-弓箭手訓練營
 */
public class ArcherTrainingCamp implements TrainingCamp {
    private static EquipFactory factory = new ArcherEquipFactory();

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("訓練一個弓箭手");
        Archer archer = new Archer();
        // ...進行基本訓練
        // ...弓箭手訓練課程
        // 訓練完成配發裝備
        archer.setWeapon(factory.productWeapon());
        archer.setClothes(factory.productArmor());
        return archer;
    }
}