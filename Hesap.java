import java.util.Scanner;

public class Hesap extends Banka{
    
    private int mevcutBakiye = 0;
	private String kisiBilgisi;
	private int[] referansKodu;
	
	static Boolean[][] matrix = new Boolean[3][15];

	public Hesap(int mevcutBakiye, String kisiBilgisi, int[] referansKodu) {
		
		this.mevcutBakiye = mevcutBakiye;
		this.kisiBilgisi = kisiBilgisi;
		this.referansKodu = referansKodu;
	}
	
	 static void IslemYap() {
	
		System.out.println("Bankamiza Hosgeldiniz....");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 15; j++) {
				if (i == 0 && j < 5) {
					matrix[i][j] = true;
				} else if (i == 1 && j < 10) {
					matrix[i][j] = true;
				} else if (i == 2 && j < 15) {
					matrix[i][j] = true;
				} else
					matrix[i][j] = false;
			}
		}
		while (true) {
			System.out.println("cikis yapmak istiyorsanýz 1'i para yatirmak için 2'i tuslayiniz:\n");
	    	int sayi;
			Scanner scanner = new Scanner(System.in);
			sayi = scanner.nextInt();
			if (sayi == 2) {
				System.out.println("referans kodunuzdan birini giriniz:");
				int girilenreferans = scanner.nextInt();
				
				ReferansKontrol(girilenreferans);
				
			} else if (sayi == 1) {
				System.out.println("bankamizi sectiginiz icin tesekkür ederiz.");
				break;
			} else
				System.out.println("Yanliþ bir sayi tusladiniz lütfen tekrar deneyin...");
		}
	}
	private static void ReferansKontrol(int girilenreferans) {
		int kontrol = 0;
		for (int k = 0; k < 5; k++) {
			if (girilenreferans == referansKodlari1[k]) {
				Birincikullanýcý(matrix[0][k]);
			} else if (girilenreferans == referansKodlari2[k]) {
				ikincikullanýcý(matrix[1][k]);
			} else if (girilenreferans == referansKodlari3[k]) {
				ucuncukullanýcý(matrix[2][k]);
			} else if (girilenreferans != referansKodlari1[k] && girilenreferans != referansKodlari2[k]
					&& girilenreferans != referansKodlari3[k]) {
				kontrol++;
				if (kontrol == 5) {
					System.out.println("girdiðiniz referans kodu hatalý");
				} else
					continue;
			} else {
				continue;
			}

		}
		
	}
	public static void Birincikullanýcý(Boolean matrix) {
		System.out.println("yatrýlacak tutar");
		int para;
		Scanner scanner = new Scanner(System.in);
		para = scanner.nextInt();
		if (matrix) {
			System.out.println(hesap1.getKisiBilgisi() + " isimli hesaba " + para + " para yatýracaksýnýz");
			hesap1.setMevcutBakiye(hesap1.getMevcutBakiye()+para);
			System.out.println("mevcut bakiyeniz: " + hesap1.getMevcutBakiye());

		}
	}

	public static void ikincikullanýcý(Boolean matrix) {
		System.out.println("yatýrýlacak para");
		int para;
		Scanner scanner = new Scanner(System.in);
		para = scanner.nextInt();
		if (matrix) {
			System.out.println(hesap2.getKisiBilgisi() + " isimli hesaba " + para + " para yatýracaksýnýz");
			hesap2.setMevcutBakiye(hesap2.getMevcutBakiye()+para);
			System.out.println("mevcut bakiyeniz: " +hesap2.getMevcutBakiye());

		}
	}

	public static void ucuncukullanýcý(Boolean matrix) {
		System.out.println("yatýrýlacak para");
		int para;
		Scanner scanner = new Scanner(System.in);
		para = scanner.nextInt();
		if (matrix) {
			System.out.println(hesap3.getKisiBilgisi() + "isimli hesaba " + para + " para yatýracaksýnýz");
			hesap3.setMevcutBakiye(hesap3.getMevcutBakiye()+para);
			System.out.println("mevcut bakiyeniz: " +hesap3.getMevcutBakiye());

		}
	}
	public int getMevcutBakiye() {
		return mevcutBakiye;
	}

	public void setMevcutBakiye(int mevcutBakiye) {
		this.mevcutBakiye = mevcutBakiye;
	}

	public String getKisiBilgisi() {
		return kisiBilgisi;
	}

	public void setKisiBilgisi(String kisiBilgisi) {
		this.kisiBilgisi = kisiBilgisi;
	}

	public int[] getReferansKodu() {
		return referansKodu;
	}

	public void setReferansKodu(int[] referansKodu) {
		this.referansKodu = referansKodu;
	}

	public static Boolean[][] getMatrix() {
		return matrix;
	}

	public static void setMatrix(Boolean[][] matrix) {
		Hesap.matrix = matrix;
	}
	

		
		
		
	}

