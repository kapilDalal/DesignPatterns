package starbuzzCoffeDecoratorPattern;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@ComponentScan("starbuzzCoffeDecoratorPattern")
@Configuration
public class StarbuzzConfigurationClass {
	
	@Bean
	public Espresso getEspresso(){
		return new Espresso();
	}
	
	@Bean
	public Latte getLatte(){
		return new Latte();
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertyPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	

}
