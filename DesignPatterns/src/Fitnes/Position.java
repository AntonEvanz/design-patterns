package Fitnes;

public class Position {
	
	private Boolean standUp;
	public static String position = "";
	
	public void switchOn() {
		System.out.println("Trainer stand up");
		this.standUp = true;
		position = "stand up";
	}
	
	public void switchOff() {
		System.out.println("Trainer lay down");
		this.standUp = false;
		position = "lay down";
	}
	
}