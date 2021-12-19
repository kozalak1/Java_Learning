package Java_Learning;

import java.util.Scanner;

public class Q_8 {

	public static void main(String[] args) {
			// int veri türünün Maximum ve Minimum değerlerini gösteren kodu konsola yazınız.//
		
		
			//	System.out.println();

			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
				
				
				 	
				
			//	Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.	
				
				
				Scanner scan=new Scanner(System.in);
				System.out.print("lutfen DOUBLE bir sayı girin : ");
				double sayi=scan.nextDouble();
				
				int sayi2=(int) sayi; // Casting yapıyoruz(narrowing) ; geniş veri tipini dar veri tipine geçmeye zorluyoruz
										// burada bir veri kaybı oluyor.
				
				System.out.println("girdiğiniz sayının int karşılığı :"+sayi2);
				
	}

}
