package Post;

public class Package {
	public String specialization;
	public String status;
	public Package(String specialization, String status) {
		this.setSpec(specialization);
		this.setStatus(status);
	}
	
	public void setSpec(String specialization) {
		this.specialization = specialization;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
