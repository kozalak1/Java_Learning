package Java_Learning;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		
		/* Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
		 Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

		1 şeker = 1.7 gr

		Örnek Çıktı:

		Yılda 12.41 kg şeker kullanıyor. */

		Scanner scan=new Scanner(System.in);

		System.out.print("Günlük kaç bardak çay içiyorsunuz :");
		double bardakSayisi=scan.nextDouble();

		System.out.print("1 bardak için kaç şeker kullanıyorsunuz : ");
		double sugarSayisi=scan.nextDouble();

		System.out.println("Çay içerken yılda "+((bardakSayisi*sugarSayisi*365*1.7))/1000 +" kg şeker kullanıyorsunuz.");


	}

}
