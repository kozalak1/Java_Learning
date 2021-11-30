package Java_Learning;

import java.util.Scanner;

public class Q_14 {

	public static void main(String[] args) {
	/*	Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

		INPUT:

		Ay Numarasi:

		2

		Yil :

		2016

		OUTPUT :

		Subat 2016 29 Gundur. */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen ay numarasını giriniz :");
		
		int ayNumarası=scan.nextInt();
		
		switch (ayNumarası) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Girdiğiniz ay 31 gün");
			break;

		
		case 4:
		case 6:
		case 9:	
		case 11:	
			System.out.println("Girdiğiniz ay 30 gün");
			break;
		
		
		case 2:
			
			System.out.println("lutfen yılı giriniz :");
			
			int yıl=scan.nextInt();
			
			if (yıl%4==0) {
				System.out.print("Girdiğiniz ay 29 gün");
			} else {
				System.out.println("Girdiğiniz ay 28 gün");
			}
			break;
			
			
		default:
			
			System.out.println("lutfen ay numarası giriniz");
			break;
		}
		
		
	}

}
