package loopDemo;

public class Main {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("For dongusu bitti!");

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("While dongusu bitti!");

		int j = 10;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("Do-While dongusu bitti!");

	}

}
