package Fitness;

public class StandUp implements Command {

	private Position task;
	
	public StandUp(Position task) {
		this.task = task;
	}

	@Override
	public void execute() {
		this.task.switchOn();
	}

}