package behavior.templateMethodPattern.barista;

/*
 * 模板方法 : 希望將算法流程相似的類別統一，並 * 會依照各類
 * 別改變方法內容的則為抽象方法，讓子累自己去實現，相同的方法
 * 就不須重複寫在類別中，達到減少重複程式碼的目的
 *
 * 在CaffeineBeverage中，就只需要注意prepareRecipe的實現
 * 流程即可，剩餘的抽象方法就可抽出交給子類，減少每個類負責的
 * 運算邏輯
 *
 *
 * */
public abstract class CaffeineBeverage {

	//此方法不希望被修改，使用final
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	//==咖啡和茶中此兩方法會依照類別改變
	abstract void brew();
  
	abstract void addCondiments();
	//==

	//相同的方法流程抽出，減少重複的程式碼
	void boilWater() {
		System.out.println("Boiling water");
	}
  
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
