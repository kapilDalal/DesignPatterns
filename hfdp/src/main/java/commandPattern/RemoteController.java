package commandPattern;

import java.util.Stack;

public class RemoteController {
	
	private Command[] onSlot;
	private Command[] offSlot;
	private Stack<Command> undoStack;	
	
	public RemoteController(){
		this.onSlot = new Command[7]; 
		this.offSlot = new Command[7];
		for(int i=0;i<onSlot.length;i++){
			this.onSlot[i] = new NoCommand();
			this.offSlot[i] = new NoCommand();
		}	
		undoStack = new Stack<Command>();
	}
	public void setCommand(int num,Command  onCommand,Command offCommand){
		this.onSlot[num] = onCommand;
		this.offSlot[num] = offCommand;
	}
	
	public void onButtonPressed(int num){
		onSlot[num].execute();		
		undoStack.add(onSlot[num]);
	}
	
	public void offButtonPressed(int num){
		offSlot[num].execute();		
		undoStack.add(offSlot[num]);
	}
	
	public void undoButtonPressed(){		
		if(!undoStack.isEmpty()) {
			Command command = undoStack.pop();
			command.undo();
		}
	}

}
