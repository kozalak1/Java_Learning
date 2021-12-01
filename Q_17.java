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
		
		 if (ad.length()>=2) {
			 
			String yeniAd=ad.substring(ad.length()-2);
			
			System.out.println(yeniAd+yeniAd+yeniAd);
			
						 
		 }
			 
		 else {
			 
			 System.out.println("lutfen en az 2 karakterli bir isim giriniz!");
		 }
	}

}
