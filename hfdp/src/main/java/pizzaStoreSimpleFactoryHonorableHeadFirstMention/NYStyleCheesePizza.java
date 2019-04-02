package pizzaStoreSimpleFactoryHonorableHeadFirstMention;

import java.util.Arrays;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		pizzaName = "New york style cheese pizza";
		sauce = "New York style cheese sauce";
		toppings.addAll(Arrays.asList("onion", "tomato", "jallepino"));
	}

}