package asalSayiBulmaProject;

public class Main {

	public static void main(String[] args) {
		int number = 23;
		int i = 2;
		boolean isEven = true;

		if (number == 1) {
			System.out.println();
		}
		if (number < 1) {
			System.out.println(number + "gecersiz sayidir!, tekrar deneyin.");
		}

		while (i < number && isEven) {
			if (number % i == 0) {
				isEven = false;
			}
			i++;
		}

		if (isEven) {
			System.out.println(number + " asal sayidir.");
		} else {
			System.out.println(number + " asal sayi degildir.");
		}
	}

	// P.S : En başta 2'ye bölünme kontrol etseydik yarı yarıya performans artışı
	// olurdu

}
