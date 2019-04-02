package pizzaStoreFactoryMethodPattern;

import java.util.Arrays;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza(){
		pizzaName = "Chicago style cheese pizza";
		sauce = "Chicago style cheese sauce";
		toppings.addAll(Arrays.asList("onion","tomato","jallepino"));		
	}
}
