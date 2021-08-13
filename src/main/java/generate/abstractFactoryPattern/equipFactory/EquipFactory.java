package generate.abstractFactoryPattern.equipFactory;

import generate.abstractFactoryPattern.clothes.Clothes;
import generate.abstractFactoryPattern.weapons.Weapon;

/**
 * 裝備工廠介面(Factory)-定義每一間工廠應該生產哪些東西
 */
public interface EquipFactory {
    /**
     * 製造武器
     */
    Weapon productWeapon();
    /**
     * 製造衣服
     */
    Clothes productArmor();
}
