package Java_Learning;

import java.util.Scanner;

public class Q_12 {

	public static void main(String[] args) {
	/*	Verilen iki tam sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
	 *  Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

		Ornek:

		INPUT :

		25

		46

		OUTPUT :

		Numaralarin Toplami:

		71
			*/
		
		
		Scanner Scan=new Scanner(System.in);
		System.out.print("lutfen 2 tam sayı giriniz, 1. sayıdan sonra enter e basınız:");
		long sayi1=Scan.nextLong();
		long sayi2=Scan.nextLong();
		long toplam=sayi1+sayi2;
		
		if (sayi1<0 || sayi2<0 || sayi1>999999999 || sayi2>999999999 || toplam>999999999 ) {
			
			System.out.println("OverFlow");
			
		} 
		
				
		else  {

			System.out.println("Numaraların Toplamı :" + toplam);
			
		}
		
		
	}

}
