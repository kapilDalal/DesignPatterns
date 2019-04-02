package starbuzzCoffeDecoratorPattern;

import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:PricesForStarbuzz.properties")
public class Vanilla extends CondimentDecorator{
	
	Beverage beverage;
	
	//@Value("${Vanilla.price}")
	private String rateOfVannila;
	
	public Vanilla(Beverage beverage){
		this.beverage = beverage;
		setCostOfVannilaAccordingToSize();
	}
	
	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return beverage.getDiscription()+",Vanilla";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return Double.parseDouble(rateOfVannila)+beverage.cost();
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}

	@Override
	public void setSize(String sizeOfTheBeverage) {
		// TODO Auto-generated method stub
		
	}
	
	private void setCostOfVannilaAccordingToSize(){
		if(getSize() == "tall")
			rateOfVannila = "50";
		else if(getSize() == "grande")
			rateOfVannila = "60";
		else if(getSize() == "venti")
			rateOfVannila = "70";
	}

}
