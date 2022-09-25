package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranan = 5;
		boolean isFound = false;

		for (int sayi : sayilar) {
			if (sayi == aranan) {
				isFound = true;
				break;
			}
		}

		if (isFound) {
			mesajVer("Sayi mevcut: " + aranan);
		} else {
			mesajVer("Sayi mevcut degil: " + aranan);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
