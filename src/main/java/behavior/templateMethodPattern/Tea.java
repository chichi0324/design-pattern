package behavior.templateMethodPattern;

public class Tea {
 
	void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	//======重複的程式碼
	public void boilWater() {
		System.out.println("Boiling water");
	}
	//======
 
	public void steepTeaBag() {
		System.out.println("Steeping the tea");
	}
 
	public void addLemon() {
		System.out.println("Adding Lemon");
	}

	//======重複的程式碼
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	//======
}
