package Fitnes;

public class ObserverMain {

	public static void main(String[] args) {


		Task task = new Task();
		Viewer obs1 = new TaskSubscriber("Viewer 1");
		Viewer obs2 = new TaskSubscriber("Viewer 2");
		Viewer obs3 = new TaskSubscriber("Viewer 3");
		
		task.subscribe(obs1);
		task.subscribe(obs2);
		task.subscribe(obs3);
		
		Instructor remoteController = new Instructor();
		Position position = new Position();
		Command standUp = new StandUp(position);
		Command layDown = new LayDown(position);
		
		remoteController.setCommand(standUp);
		remoteController.pressButton();
		String task1 = Position.position;
		task.setTask(task1);
		
		remoteController.setCommand(layDown);
		remoteController.pressButton();
		String task2 = Position.position;
		task.setTask(task2);
				
	}
	

}
