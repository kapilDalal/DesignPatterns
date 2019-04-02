package duckSimulatorStrategyPattern;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuckSimulatorConfigurationClass {

	@Bean
	public WhiteDuck getWhiteDuck() {
		WhiteDuck whiteDuck = new WhiteDuck();
		whiteDuck.setFlyingBehaviour(getNormalFlyingBehaviour());
		whiteDuck.setSoundBehaviour(getNormalDuckSoundBehaviour());
		return whiteDuck;
	}

	@Bean
	public PlasticDuck getPlasticDuck() {
		PlasticDuck plasticDuck = new PlasticDuck();
		plasticDuck.setFlyingBehaviour(getPlasticDuckFlyingBehaviour());
		plasticDuck.setSoundBehaviour(getPlasticDuckSoundBehaviour());
		return plasticDuck;
	}
	
	@Bean
	public FlyingBehaviour getNormalFlyingBehaviour() {
		return new NormalDuckFlyingBehaviour();
	}

	@Bean
	public FlyingBehaviour getPlasticDuckFlyingBehaviour() {
		return new PlasticDuckFlyingBehaviour();
	}

	@Bean
	public SoundBehaviour getNormalDuckSoundBehaviour() {
		return new NormalDuckMakingNoiseBehaviour();
	}

	@Bean
	public SoundBehaviour getPlasticDuckSoundBehaviour() {
		return new PlasticDuckMakingNoiseBehaviour();
	}
}
