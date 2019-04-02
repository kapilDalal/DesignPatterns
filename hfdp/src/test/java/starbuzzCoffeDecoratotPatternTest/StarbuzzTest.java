package starbuzzCoffeDecoratotPatternTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import starbuzzCoffeDecoratorPattern.Beverage;
import starbuzzCoffeDecoratorPattern.Espresso;
import starbuzzCoffeDecoratorPattern.Latte;
import starbuzzCoffeDecoratorPattern.Mocha;
import starbuzzCoffeDecoratorPattern.StarbuzzConfigurationClass;
import starbuzzCoffeDecoratorPattern.Vanilla;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = StarbuzzConfigurationClass.class)
public class StarbuzzTest {
	
	@Autowired
	private Espresso espresso;
	
	@Autowired
	private Latte latte;
	
	@Test
	public void espressoCost(){
		assertEquals(110,espresso.cost(),0.01);
	}
	
	@Test
	public void latteCost(){
		assertEquals(130,latte.cost(),0.01);
	}
	
	
	@Test
	public void doubleMochaVanillaLatteTest(){		
		Beverage beverage = latte;
		beverage = new Mocha(beverage);				
		beverage = new Mocha(beverage);
		beverage = new Vanilla(beverage);
		System.out.println(beverage.cost());
		assertEquals(260,beverage.cost(),0.01);
	}
	
	@Test
	public void sizeOfBeverageTest(){
		Beverage beverage = espresso;
		beverage.setSize("grande");
		beverage = new Vanilla(beverage);
		assertEquals(170, beverage.cost(),0.01);		
	}
	
	
	

}
