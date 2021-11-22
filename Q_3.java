package Java_Learning;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		 
		// Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
		 
		Scanner scan=new Scanner(System.in);
		
		System.out.print("lutfen bir sayı giriniz : ");
		
		double sayi=scan.nextDouble();
		 
		System.out.println((sayi*sayi*sayi)/2);

	}
	
}
