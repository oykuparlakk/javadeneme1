
public class Main {
        public static void main(String[] args) {
        	
        	/*Soru 2: Nesneye Yönelik Programlama teknikleri kullanarak bir banka hesap bilgisi tanımlayınız. Bu hesap
           kişi bilgileri ve bakiye (mevcut tutar) şeklinde iki bilgi barındırsın. Bu banka hesabına referans kodu
           kullanarak para yatırılmaktadır. Bir banka bir hesap için birden fazla sayıda referans kodu tanımlayabilir.
           Bu bankada her banka hesabı için maksimum 5 adet referans kodu tanımlansın ve bu bankada 3 farklı hesap
           olsun. Bu hesapların her birine referans kodları kullanarak 50 TL ve 10TL değerinde para yatırılsın.
           Bankadaki tüm hesaplardaki tutarları gösteren programı yazınız
           
           *Açıklama: Banka sınıfı içerisinde Hesap sınıfına ait dizi barındırmaktadır.
           *Ayrıca Banka sınıfı içersinde her bir referans için bir dizi bulunmaktadır.
           *Bu iki dizi birbirlerine indisler yolu ile bağlıdır.Örneğin 1. hesap nesnesi
           *1. ve  2. referans değerleri ile birbirine bağlıdır. Bu bilgi bir matriste tutulmaktadır.
           *Bu referans kodları, hesaplar ve matris aşağıdaki gibi tanımlanabilir. 
           Boolean[][] matrix = new Boolean[2][5]; 
           //1. Hesap kodu 1. ve 2. referans değerlerine sahiptir.  
           matrix[0][0] = true;  matrix[0][1] = true; matrix[0][2] = false;  
           String[] referansKodlari = new String[5]; 
           Hesap[] hesaplar = new Hesap[3];
           */
      
        	Hesap.IslemYap();
        	
        
       }
}
