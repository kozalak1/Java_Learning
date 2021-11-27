package Java_Learning;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		// Kullanıcıdan bir Float değer girmesini isteyin, 
		// bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.

		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen bir float değer (ondalıklı sayı) giriniz :");
		float sayi=scan.nextFloat();

		short sayi2= (short) sayi;
		
		System.out.println(sayi2);
		
		
	}

}
