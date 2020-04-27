package Fitnes;

public interface Trainer {
	public void subscribe(Viewer observer);
	public void unsubscribe(Viewer observer);
	public void notifyObservers();
	public String getUpdate();
}