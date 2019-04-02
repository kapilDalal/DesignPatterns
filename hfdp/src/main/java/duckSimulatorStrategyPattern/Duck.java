package duckSimulatorStrategyPattern;

public class Duck {
	FlyingBehaviour flyingBehaviour;
	SoundBehaviour soundBehaviour;

	public void swim() {
		System.out.println("Duck Swimming");
	}

	public void display() {
		System.out.println("Duck being Displayed");
	}

	public String fly() {
		return flyingBehaviour.fly();
	}

	public String makeNoise() {
		return soundBehaviour.makeNoise();
	}

	public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
		this.flyingBehaviour = flyingBehaviour;
	}

	public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}
}
