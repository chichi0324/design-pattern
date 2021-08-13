package generate.abstractFactoryPattern.clothes;

/**
 * 上衣介面(Product)
 */
public abstract class Clothes {
    protected int def;    // 防禦力
    /**
     * 展示這件衣服
     */
    public void display(){
        System.out.println(this.getClass().getSimpleName() + " def = " + def);
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
