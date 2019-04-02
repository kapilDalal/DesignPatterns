package starbuzzCoffeDecoratorPattern;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:PricesForStarbuzz.properties")
public class Latte extends Beverage{

	@Value("${Latte.price}")
	private String rateOfLatte;
	
	private String sizeOfTheBeverage;
	
	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		super.discription = "Latte";
		return "Latte";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return Double.parseDouble(rateOfLatte);
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return sizeOfTheBeverage;
	}

	@Override
	public void setSize(String sizeOfTheBeverage) {
		// TODO Auto-generated method stub
		this.sizeOfTheBeverage = sizeOfTheBeverage;
	} 
	
	public void test(){
		System.out.println("To check if we can call subclass non-overriden method with superclass reference");
	}
	
	

}
