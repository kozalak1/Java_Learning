package Java_Learning;

public class Q_25_For_While {

	public static void main(String[] args) {
		
		// 'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.
		
		 // ornek : Ascii value of a = 97 
		

		for (int i = 'a'; i <='z'; i++) {
			char chr=(char) i;
			
			System.out.println(chr +"--"+ "Ascii value of "+ "=" + i );
		}
		
	}

}
