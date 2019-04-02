package pizzaStoreFactoryMethodPattern;

public class Main {
	
	public static void main(String[] args) {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		pizzaStore.orderPizza("cheese");
	}

}
