package Java_Learning;

import java.util.Scanner;

public class Q_18_For_While {

	public static void main(String[] args) {
		
		/* Kullanıcıdan bir cümle ve bir karakter girmesini isteyin,
		 * ardından döngüleri kullanarak karakterin cümlede kaç kez tekrarlandığını kontrol edin.
		
			char ch1= 'a' ;

			String name =“John came late" 

			Expected Output: 
	
			Number of a = 2 
	
		 	*/

		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("lutfen bir cümle yazınız : ");

		String cümle=scan.nextLine().toLowerCase(); // kullanıcıdan cumle alıp küçük harfe çevirdim
		
		
		System.out.print("lutfen bir karakter yazınız : ");
	
		char karakter=scan.next().toLowerCase().charAt(0); // kullanıcıdan 1 karakter alıp küçük harfe çevirdim
		
				int sayac=0; // bos bir int sayac oluşturduk 
		
				for (int i = 0; i < cümle.length(); i++) {
			
					if(cümle.charAt(i)==karakter)	// girilen cümlenin sırasıyla i indeksindeki karakter , kullanıcının girdiği karaktere eşit ise;
						
						sayac++;		// sayac ı bir arttır
						
		}
		
				System.out.println("Girdiğiniz karakterin cümledeki sayısı : " + sayac);
		}	
			
}
