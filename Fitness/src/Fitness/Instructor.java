package Fitness;

public class Instructor {
	
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		System.out.println("New Position!");
		this.command.execute();
	}
	
}