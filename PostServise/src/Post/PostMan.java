package Post;

public class PostMan {
	public static String SendingPackageToWarehouse(Package pack) {
		pack.status="Warehouse";
		System.out.println("Postal man moved package. Package is in warehouse now.");
		System.out.println("Package status is:"+pack.status+"\n");
		return pack.status;
	}
}
