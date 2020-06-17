package Post;

public class Sender {
	public String name;
	public String packageSpec;
	public String packageStatus;
	Package pack = new Package("", "");
	public Sender(String packageSpec, String packageStatus, String name) {

		pack = new Package(packageSpec, packageStatus);
		this.setName(name);
		this.setPackSpec(packageSpec);
		this.setPackStatus(packageStatus);
		System.out.printf("%45s%n",name+" came to post servise with package.");
		System.out.println("Package status is:"+packageStatus+"\n");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPackSpec(String packageSpec) {
		this.packageSpec = packageSpec;
	}
	
	public void setPackStatus(String packageStatus) {
		this.packageStatus = packageStatus;
	}
}
