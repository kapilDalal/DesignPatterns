package starbuzzCoffeDecoratorPattern;

public abstract class Beverage {
	String discription = "Beverage";
	
	public abstract String getDiscription();
	
	public abstract double cost();
	
	public abstract String getSize();
	
	public abstract void setSize(String sizeOfTheBeverage);
}
