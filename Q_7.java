package Java_Learning;

import java.util.Scanner;

public class Q_7 {

	public static void main(String[] args) {
		/*Kullanıcıdan dikdörtgenin kenar uzunluklarını alın,
		 *  ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

		Örnek Çıktı:

		Alan: 32

		Çevre: 24 */

		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen diktortgenin 1. kenar uzunlugunu girin : ");
		int kenarUzunluk1=scan.nextInt();
		
		System.out.print("lutfen diktortgenin 2. kenar uzunlugunu girin : ");
		int kenarUzunluk2=scan.nextInt();
		
		System.out.println("Alan :" + (kenarUzunluk1*kenarUzunluk2) );
		System.out.println("Cevre :" + (kenarUzunluk1+kenarUzunluk2)*2);
	
	
	
	
	}

}
