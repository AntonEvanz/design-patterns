package Fitnes;

import java.util.ArrayList;
import java.util.List;

public class Task implements Trainer {
	
	private List<Viewer> viewers = new ArrayList<Viewer>();
	private String task;

	public void setTask(String task) {
		this.task = task;
		this.notifyObservers();
	}

	@Override
	public void subscribe(Viewer observer) {
		this.viewers.add(observer);
		observer.setTask(this);
	}

	@Override
	public void unsubscribe(Viewer observer) {
		this.viewers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Viewer observer: this.viewers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.task;
	}

}
