package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = sehirVer();
		System.out.println(mesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);

		int toplam = topla2(2, 3, 4, 5, 6);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void guncelle() {
		System.out.println("Guncellendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	// Variable args
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

}
