package commandPattern;

public class Light {
	String room;
	public Light(String room){
		this.room = room;
	}
	public void on(){
		System.out.println(room+" Light is switched On");
	}
	public void off(){
		System.out.println(room+" Light is switched off");
	}
}
