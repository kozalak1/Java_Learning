package Java_Learning;

import java.util.Scanner;

public class Q_17 {

	public static void main(String[] args) {
	
		/* Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın;

		Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

		INPUT : Mustafa

		OUTPUT : fafafa
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("lutfen bir isim yazınız : ");

		String ad=scan.next();
				
		 if (ad.length()>=2) {		// kullanıcının en az 2 karakterli bir isim girmesini kontrol ediyoruz
			 
			String yeniAd=ad.substring(ad.length()-2);	// kullanıcının girdiği ismin (ad) ın son 2 karakterini alıp yeni bir string yapıyoruz
			
			String yeniAdSon=yeniAd.concat(yeniAd+yeniAd); // concat yapıyoruz
			
			System.out.println(yeniAdSon); 	
										  
		 }
			 
		 else {
			 
			 System.out.println("lutfen en az 2 karakterli bir isim giriniz!");
		 }
	}

}
