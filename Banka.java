
public class Banka {
	
	 static int referansKodlari1[]= {4635,4637,6786,9058,8598};
	 static int referansKodlari2[]= {2345,6758,7658,5748,9806};
	 static int referansKodlari3[]= {3564,8796,9807,5677,3563};
	
	 
	  static Hesap hesap1 = new Hesap(0,"öykü parlak", referansKodlari1);
	  static Hesap hesap2 = new Hesap(500,"arzu durlanik", referansKodlari2);
	  static Hesap hesap3 = new Hesap(8000,"selin kumru", referansKodlari3);
				
	  static void HesapOlustur() {
						
		Hesap[] hesaplar = new Hesap[3];

		hesaplar[0] = hesap1;
		hesaplar[1] = hesap2;
		hesaplar[2] = hesap3;		System.out.println("hesaplar güncel..");
		
		}
	
	
	
	}
	 

