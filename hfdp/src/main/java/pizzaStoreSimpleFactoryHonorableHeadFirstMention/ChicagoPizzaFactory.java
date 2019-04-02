package pizzaStoreSimpleFactoryHonorableHeadFirstMention;

public class ChicagoPizzaFactory extends PizzaFactory{

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese"))
			return  new ChicagoStyleCheesePizza();
		return null;
	}
	
}
