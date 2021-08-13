package generate.abstractFactoryPattern.equipFactory;

import generate.abstractFactoryPattern.clothes.Armor;
import generate.abstractFactoryPattern.clothes.Clothes;
import generate.abstractFactoryPattern.weapons.LongSword;
import generate.abstractFactoryPattern.weapons.Weapon;

/**
 * 專門生產鬥士裝備的工廠(ConcreteFactory)
 */
public class WarriorEquipFactory implements EquipFactory {

    @Override
    public Weapon productWeapon() {
        LongSword product = new LongSword();
        product.setAtk(10);
        product.setRange(1);
        return product;
    }

    @Override
    public Clothes productArmor() {
        Armor product = new Armor();
        product.setDef(10);
        return product;
    }

}