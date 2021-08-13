package generate.abstractFactoryPattern.equipFactory;

import generate.abstractFactoryPattern.clothes.Clothes;
import generate.abstractFactoryPattern.clothes.Leather;
import generate.abstractFactoryPattern.weapons.Bow;
import generate.abstractFactoryPattern.weapons.Weapon;

/**
 * 專門生產弓箭手裝備的工廠(ConcreteFactory)
 */
public class ArcherEquipFactory implements EquipFactory {

    @Override
    public Weapon productWeapon() {
        Bow product = new Bow();
        product.setAtk(10);
        product.setRange(10);
        return product;
    }

    @Override
    public Clothes productArmor() {
        Leather product = new Leather();
        product.setDef(5);
        return product;
    }
}