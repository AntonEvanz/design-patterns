package Fitnes;

public class LayDown implements Command {

	private Position task;
	
	public LayDown(Position task) {
		this.task = task;
	}

	@Override
	public void execute() {
		this.task.switchOff();
	}

}
