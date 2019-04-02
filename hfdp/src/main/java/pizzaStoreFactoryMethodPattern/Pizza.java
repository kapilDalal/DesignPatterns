package pizzaStoreFactoryMethodPattern;

import java.util.ArrayList;

public abstract class Pizza {

	String pizzaName;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("preparing "+this.pizzaName);
		System.out.println("tossing dough");
		System.out.println("Adding sauces");
		System.out.println("Adding toppings..");
		for (int i = 0; i < toppings.size(); i++)
			System.out.println(toppings.get(i) + "\t");
	}

	void bake() {
		System.out.println("Heating the pizza for 25 time at 350 temperature");
	}

	void cut() {
		System.out.println("cutting the pizza in cone shape");
	}

	void box() {
		System.out.println("Box the pizza");
	}

}
