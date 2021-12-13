package Java_Learning;

public class Q_25_For_While {

	public static void main(String[] args) {
		
		// 'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.
		
		 // ornek : Ascii value of a = 97 
		

		for (int i = 'a'; i <='z'; i++) { 		// varible int oldugundan ve 'a' şeklinde yazıldığı için bir char karakterin ascii değerini alır
			char chr=(char) i;					// i int bir değer oldugundan sahip olduğu değeri char a dönüştürüyoruz (conversion)
			
			System.out.println(chr +"--"+ "Ascii value of "+ "=" + i );
		}
		
	}

}
