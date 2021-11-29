package Java_Learning;

import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {
		
		/* Kullanıcıya kilosunu ve boyunu sorun ve vücut kitle indeksini hesaplayan bir program yazın (BMI)

		IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

		BMI 18,5'in altındaysa zayıfsınız

		BMI 18,5 ile 25 arasında ise kilonuz idealdir

		BMI 25-30 arasındaysa şişmansınız

		BMI 30'dan büyük veya eşitse, obez

		Input:

		Output:

		Agirlik : 71

		Boy : 1,72

		BMI : 23.99945916711736

		Zayifsiniz. */
		
		Scanner scan=new Scanner(System.in);

		System.out.print("Lutfen kilonuzu kg cinsinden yazınız :");
		double kilo=scan.nextDouble();
		
		
		System.out.print("Lutfen boyunuzu cm cinsinden virgüllü biçimde yazınız :");
		double boy=scan.nextDouble();
		
		double BMI=kilo/(boy*boy);
		
		
		
		if (BMI>=30) {
			System.out.println("Obez olma yolunda emin adımlarla ilerliyorsunuz");
		}
		
		if (BMI>25 && BMI<30) {
			System.out.println("Şişman gibisiniz ya da fazla kilolu");
		}
		
		if (BMI>18.5 && BMI<25) {
			System.out.println("Kilonuz ideal!");
		}
		
		if (BMI<18.5) {
			System.out.println("Galiba zayıfsınız!");
		}
		
	
		
		
		
		
	}

}
