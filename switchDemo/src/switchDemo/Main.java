package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'G':
			System.out.println("Mukemmel, gectiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("Iyi, gectiniz");
			break;
		case 'D':
			System.out.println("Fena degil, gectiniz");
			break;
		case 'F':
			System.out.println("Maalesef, kaldiniz");
			break;
		default:
			System.out.println("Gecersiz girdiniz");
		}
	}

}
