package behavior.templateMethodPattern.barista;

public abstract class CaffeineBeverageWithHook {
 
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		//使用鉤子增加顧客是否要加調味的判斷
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
 
	abstract void brew();
 
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
 
	void pourInCup() {
		System.out.println("Pouring into cup");
	}

	/*此為鉤子(hook)，是個可以默認不做事的方法，可以讓子類依照各自流程的不同
	* 選擇要不要掛勾
	*
	**/
	boolean customerWantsCondiments() {
		return true;
	}
}
