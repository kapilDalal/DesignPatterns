package pizzaStoreSimpleFactoryHonorableHeadFirstMention;

public class NYPizzaFactory extends PizzaFactory{

	Pizza pizza = null;
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		
		if(type.equals("cheese"))
			pizza =  new NYStyleCheesePizza();
		return pizza;
	}

}
