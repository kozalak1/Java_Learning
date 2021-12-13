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
				
		String yeniSayi=Integer.toString(sayi);	// girilen sayı ile matematiksel bir işlem yapmayacağım için string objesi oluşturup sayıyı string e çevirdim
		
		String yeniSayii="";			// yeni bir string oluşturdum, tersine çevrilince bu objeye assign edeceğim
		
				
		for (int i = yeniSayi.length()-1; i >= 0; i--) { // for döngüsü ile string ifadenin sondan başa doğru getirmesini istedim
				
			yeniSayii=yeniSayii.concat(yeniSayi.substring(i,i+1));  // yeniSayii=yeniSayii+yeniSayi.charAt(i);----Kodu bu şekilde de yazabiliriz 
		}															// tek tek her bir karakteri yeni oluşturdugum stringe ekledim	
		
		System.out.println(yeniSayii);
		
		scan.close();
		
	}

}
