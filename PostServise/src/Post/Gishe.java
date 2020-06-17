package Post;

public class Gishe {
	public String specialization;
	public boolean freeStatus;
	
	public Gishe(String specialization, boolean freeStatus) {
		this.setSpec(specialization);
		this.setStatus(freeStatus);
	}
	
	public void setSpec(String specialization) {
		this.specialization = specialization;
	}
	
	public void setStatus(boolean freeStatus) {
		this.freeStatus = freeStatus;
	}
}
