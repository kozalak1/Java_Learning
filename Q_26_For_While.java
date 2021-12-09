package Java_Learning;

import java.util.Scanner;

public class Q_26_For_While {

	public static void main(String[] args) {
	
				/* Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu / Interview question)

			Input :1238

			Output :Girilen Numananin Tersi: 8321
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayı giriniz");
		int sayi=scan.nextInt();
				
		String yeniSayi=Integer.toString(sayi);
		
		String yeniSayii="";
		
				
		for (int i = yeniSayi.length()-1; i >= 0; i--) {
				
			yeniSayii=yeniSayii.concat(yeniSayi.substring(i,i+1));  // yeniSayii=yeniSayii+yeniSayi.charAt(i);
		}
		
		System.out.println(yeniSayii);
		
		scan.close();
		
	}

}
