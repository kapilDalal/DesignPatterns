package commandPattern;

public class RemoteControllerTest {
	
	public static void main(String[] args) {
		
		RemoteController remote = new RemoteController();
		
		Light kitchenLight = new Light("kitchen");
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
		
		
		Light lobbyLight = new Light("lobby");
		LightOnCommand lobbyLightOn = new LightOnCommand(lobbyLight);
		LightOffCommand lobbyLightOff = new LightOffCommand(lobbyLight);		
		
		remote.setCommand(0, kitchenLightOnCommand, kitchenLightOffCommand);
		remote.setCommand(1, lobbyLightOn, lobbyLightOff);
		
		
		remote.onButtonPressed(0);//switch on kitchen light.	
		
		remote.onButtonPressed(1);//switch on lobby light.
		
		remote.undoButtonPressed();//switch off lobby light.
		remote.undoButtonPressed();//switch off kitchen light.
		remote.undoButtonPressed();//won't do anything.
			
	}
	

}
