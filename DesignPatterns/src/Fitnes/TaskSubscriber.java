package Fitnes;

public class TaskSubscriber implements Viewer {

	private String name;
	private Trainer task;
	
	public TaskSubscriber(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(task == null) {
			System.out.println("No topic");
			return;
		}
		
		String taskName = task.getUpdate();
		System.out.println(this.getName() + " " + taskName);
		
	}
	@Override
	public void setTask(Trainer task) {
		this.task = task;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
