package Java_Learning;

import java.util.Scanner;

public class Q_15 {

	public static void main(String[] args) {
	
		
		/*	Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 karakter olmalıdır.
		 
		   Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

		Eger aynı karakterlere sahipse

		"isim ayni karakterlere sahiptir." yazdirin.

		Eger ayni kaakterlere sahip degilse

		"Dizenin benzersiz karakterleri var" yazdirin.

		 */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("lutfen 3 karakterli bir isim giriniz : ");

		String isim=scan.next();
		
		if (isim.length()==3) {
			
			if (isim.charAt(0)!=isim.charAt(1)&&isim.charAt(0)!=isim.charAt(2)&&isim.charAt(1)!=isim.charAt(2)) {
			
				System.out.println("Dizenin benzersiz karakterleri var");
			
			}
				else {
					
				System.out.println("isim ayni karakterlere sahiptir.");	
				
				}
				
				
		} else {

			System.out.println("isim uzunluğu 3 karakter olmalı");
			
		}
		
		
	}

}
