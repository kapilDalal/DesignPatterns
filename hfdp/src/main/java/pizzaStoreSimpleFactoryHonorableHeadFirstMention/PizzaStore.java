package pizzaStoreSimpleFactoryHonorableHeadFirstMention;



public class PizzaStore {
	
	PizzaFactory pf = null;
	
	public PizzaStore(PizzaFactory pf){
		this.pf = pf;
	}
	
	public Pizza orderPizza(String type){
		Pizza pizza= null;
		pizza = pf.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

}
