package starbuzzCoffeDecoratorPattern;

import org.springframework.context.annotation.PropertySource;


@PropertySource("classpath:PricesForStarbuzz.properties")
public class Mocha extends CondimentDecorator{

	Beverage beverage;
	
	//@Value("${Mocha.price:40}")
	private String rateOfMocha = "40";
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
		setCostOfMochaAccordingToSize();
	}
	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return beverage.getDiscription()+",Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return Double.parseDouble(rateOfMocha)+beverage.cost();
	}
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setSize(String sizeOfTheBeverage) {
		// TODO Auto-generated method stub
		
	}
	
	private void setCostOfMochaAccordingToSize(){
		if(getSize() == "tall")
			rateOfMocha = "40";
		else if(getSize() == "grande")
			rateOfMocha = "50";
		else if(getSize() == "venti")
			rateOfMocha = "60";
	}

}
