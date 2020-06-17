package Post;

public class PackageProcessing {
	public static void Sending(Package pack, Gishe gishe1, Gishe gishe2, Gishe gishe3) {
		String gishe = "";
		if(pack.specialization==gishe1.specialization) {
			gishe="Foreign";
			gishe1.freeStatus = false;
			System.out.println(gishe1.specialization+" gishe get package and processing it.");
			pack.status="Processing";
			System.out.println("Package status is: "+pack.status+"\n");
		}
		else if(pack.specialization==gishe2.specialization) {
			gishe="Country";
			gishe2.freeStatus = false;
			System.out.println(gishe2.specialization+" gishe get package and processing it.");
			pack.status="Processing";
			System.out.println("Package status is: "+pack.status+"\n");
		}
		else if(pack.specialization==gishe3.specialization) {
			gishe="Plovdiv";
			gishe3.freeStatus = false;
			System.out.println(gishe3.specialization+" gishe get package and processing it.");	
			pack.status="Processing";
			System.out.println("Package status is: "+pack.status+"\n");
		}
		
		
		if(gishe1.freeStatus == false||gishe2.freeStatus==false||gishe3.freeStatus==false) {
			pack.status=PostMan.SendingPackageToWarehouse(pack);
		}
		
		
		if(gishe=="Foreign") {
			gishe1.freeStatus = true;
			System.out.println(gishe1.specialization+" gishe is free again\n");			
		}
		else if(gishe=="Country") {
			gishe2.freeStatus = true;
			System.out.println(gishe2.specialization+" gishe is free again\n");
		}
		else if(gishe=="Plovdiv") {
			gishe3.freeStatus = true;
			System.out.println(gishe3.specialization+" gishe is free again\n");			
		}
	}
}
