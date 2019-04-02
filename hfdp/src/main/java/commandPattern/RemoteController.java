package commandPattern;

public class RemoteController {
	
	Command[] onSlot;
	Command[] offSlot;
	Command undo;
	public RemoteController(){
		this.onSlot = new Command[7]; 
		this.offSlot = new Command[7];
		for(int i=0;i<onSlot.length;i++){
			this.onSlot[i] = new NoCommand();
			this.offSlot[i] = new NoCommand();
		}	
	}
	public void setCommand(int num,Command  onCommand,Command offCommand){
		this.onSlot[num] = onCommand;
		this.offSlot[num] = offCommand;
	}
	
	public void onButtonPressed(int num){
		onSlot[num].execute();
		undo = onSlot[num];
	}
	
	public void offButtonPressed(int num){
		offSlot[num].execute();
		undo = offSlot[num];
	}
	
	public void undoButtonPressed(){
		undo.undo();
	}

}
