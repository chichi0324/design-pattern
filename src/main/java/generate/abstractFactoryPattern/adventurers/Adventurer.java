package generate.abstractFactoryPattern.adventurers;

import generate.abstractFactoryPattern.clothes.Clothes;
import generate.abstractFactoryPattern.weapons.Weapon;

/**
 * 冒險者
 */
public abstract class Adventurer {
    protected Weapon weapon;    //武器
    protected Clothes clothes;  //衣服
    /**
     * 看冒險者的狀態
     */
    public abstract void display();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
}
