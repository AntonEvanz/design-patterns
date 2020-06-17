package Post;

public class PostMain {

	public static void main(String[] args) {
		Gishe foreign =new Gishe("Foreign", true);
		Gishe country =new Gishe("Country", true);
		Gishe plovdiv =new Gishe("Plovdiv", true);
		
		Sender petya = new Sender("Plovdiv", "Ready", "Petya");
		PackageProcessing.Sending(petya.pack, foreign, country, plovdiv);
		Sender anya = new Sender("Foreign", "Ready", "Anya");
		PackageProcessing.Sending(anya.pack, foreign, country, plovdiv);
		Sender tanya = new Sender("Country", "Ready", "Tanya");
		PackageProcessing.Sending(tanya.pack, foreign, country, plovdiv);
	}
}
