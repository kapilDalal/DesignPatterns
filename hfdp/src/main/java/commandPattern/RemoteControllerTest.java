package commandPattern;

public class RemoteControllerTest {
	public static void main(String[] args) {
		RemoteController remote = new RemoteController();
		
		Light kitchenLight = new Light("kitchen");
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
		
		remote.setCommand(0, kitchenLightOnCommand, kitchenLightOffCommand);
		remote.onButtonPressed(0);
		remote.undoButtonPressed();
		
	}
	

}
