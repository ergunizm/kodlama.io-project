package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		// reference type olduğu için çalıştı
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
