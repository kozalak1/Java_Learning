package Java_Learning;

import java.util.Scanner;

public class Q_9 {

	public static void main(String[] args) {
		/*  Kullanıcıdan üç basamaklı bir sayı girmesini 
		 *
		 * ve bu sayının basamaklarının toplamını bulmasını isteyin.

			Örnek Çıktı:

			Verilen tamsayının rakamları toplamı 10'dur. */

		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen 3 basamaklı bir sayi giriniz : ");
		int sayi=scan.nextInt();
		
		int rakamlarToplamı=0;
		
		int rakam=sayi%10; // birler basamağını elde etmiş olduk
		
		rakamlarToplamı+=rakam; 
		
		sayi/=10; // birler basamağından kurtuluyoruz
		
		rakam=sayi%10; //  onlar basamağını elde etmiş olduk
		
		rakamlarToplamı+=rakam; 
		
		sayi/=10; // onlar basamağından kurtuluyoruz
		
		rakamlarToplamı+=sayi;
		
		System.out.println("Girdiginiz sayinin rakamlar toplami : " +rakamlarToplamı);
		
	
		
		
	}

}
