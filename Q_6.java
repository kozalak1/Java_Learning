package Java_Learning;

import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {
		/* Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

			Ornek Cikti :

			Alan: 9

			Cevre: 12 */

		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen karenin kenar uzunlugunu girin : ");

		int kenarUzunluk=scan.nextInt();
		
		System.out.println("Alan : " + (kenarUzunluk*kenarUzunluk));
		System.out.println("Cevre :" + (kenarUzunluk*4) );
	}

}
