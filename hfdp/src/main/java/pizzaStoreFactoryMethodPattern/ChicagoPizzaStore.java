package pizzaStoreFactoryMethodPattern;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese"))
			return new ChicagoStyleCheesePizza();
		else if(type.equals("veggie"))
			return new ChicagoStyleVeggie();
		return null;
	}

}
