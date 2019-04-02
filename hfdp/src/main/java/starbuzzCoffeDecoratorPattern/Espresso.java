package starbuzzCoffeDecoratorPattern;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:PricesForStarbuzz.properties")
public class Espresso extends Beverage{

	@Value("${Espresso.price}")
	private String rateOfEspresso;
	
	private String sizeOfTheBeverage;
	
	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		super.discription = "Espresso";
		return "Espresso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return Double.parseDouble(rateOfEspresso);
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

}
