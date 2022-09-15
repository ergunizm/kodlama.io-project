package sayiBulmaProject;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranan = 5;
		boolean isFound = false;
		
		
		// WHILE içinde isFound kontrol etmek yerine for ve break kullanarak yapabiliriz.		
		/*int i = 0;
		  while (!isFound && i < sayilar.length) {
			if (aranan == sayilar[i]) {
				isFound = true;
			}
			i++;
		}*/
		
		for(int sayi:sayilar) {
			if(sayi==aranan) {
				isFound = true;
				break;
			}
		}
		
		if(isFound) {
			System.out.println("Sayi mevcut!");
		}else {
			System.out.println("Sayi mevcut degil!");
		}

	}

}
