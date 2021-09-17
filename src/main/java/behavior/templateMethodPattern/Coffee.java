package behavior.templateMethodPattern;

public class Coffee {
 
	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	//======重複的程式碼
	public void boilWater() {
		System.out.println("Boiling water");
	}
	//======
 
	public void brewCoffeeGrinds() {
		System.out.println("Dripping Coffee through filter");
	}

	//======重複的程式碼
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	//======

	public void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");
	}
}
