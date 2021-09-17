package behavior.templateMethodPattern.sort;

/* 舉一個常用的排序例子，當要排序一物品時，會implements Comparable
* 這個interface並override compareTo方法
*
* */
public class Duck implements Comparable<Duck> {
	String name;
	int weight;
  
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
 
	public String toString() {
		return name + " weighs " + weight;
	}
  
	public int compareTo(Duck otherDuck) {
 
  
		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else { // this.weight > otherDuck.weight
			return 1;
		}
	}
}
