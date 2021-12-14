package Java_Learning;

import java.util.Scanner;

public class Q_21_For_While {

	public static void main(String[] args) {
		
		/*	Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

		Input : 6

		Output: 6!=65432*1=720
		
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.print("lutfen pozitif bir tam sayı giriniz : ");
		
		double sayi=scan.nextDouble(); // kullanıcı ondalıklı sayı da girebileceği için double data type ını kullandık
		
			double result=1; // çarpma işleminde 1 etkisiz eleman olduğu için ilk değer olarak atadık
						
		if (sayi<0 ) {
			 System.out.println("lutfen pozitif bir sayı giriniz");
			
		} else {

			for (double i = sayi; i>=1; i--) {
			
				result*=i;
			}	
						
			System.out.println(result);	
			
		}
	
	}

}
