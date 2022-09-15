package sesliHarflerProject;

public class Main {

	public static void main(String[] args) {
		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(harf + " kalin sesli harftir.");
		default:
			System.out.println(harf + " ince sesli harftir.");
		}

	}

}
