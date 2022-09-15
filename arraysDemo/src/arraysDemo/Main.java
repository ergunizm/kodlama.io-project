package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "ergun";
		ogrenciler[1] = "ali";
		ogrenciler[2] = "ahmet";
		ogrenciler[3] = "engin";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-------------------------------------");

		// diger for
		// derste gösterdiği array tanımlama
		String[] ogrenciler2 = {"ergun","ali","ahmet","engin"};

		for (String ogrenci : ogrenciler2) {
			System.out.println(ogrenci);
		}

	}

}
