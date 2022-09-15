package mukemmelSayiProject;

public class Main {

	public static void main(String[] args) {
		// kendisinden başka pozitif bölenlerinin toplamına eşit olan sayı

		int number = 28;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		if (total == number) {
			System.out.println(number + " mukemmel sayidir!");
		} else {
			System.out.println(number + " mukemmel sayi degildir!");
		}

	}

}
