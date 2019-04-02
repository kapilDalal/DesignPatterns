package duckSimulatorStrategyPatternTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import duckSimulatorStrategyPattern.DuckSimulatorConfigurationClass;
import duckSimulatorStrategyPattern.WhiteDuck;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DuckSimulatorConfigurationClass.class)
public class DuckSimulationTest {

	@Autowired
	private WhiteDuck whiteDuck;

	@Test
	public void whiteDuckFlyTest() {
		assertEquals("flying normally", whiteDuck.fly());
	}

	@Test
	public void whiteDuckSoundTest() {
		assertEquals("Quack..Quack...!!!", whiteDuck.makeNoise());
	}


}
