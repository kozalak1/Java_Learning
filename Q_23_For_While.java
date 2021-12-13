package Java_Learning;

import java.util.Iterator;

public class Q_23_For_While {

	public static void main(String[] args) {
	
		/*	Konsolda Alfabeyi Yazdıran programi yaziniz.

		OUTPUT :

		a b c .. .. .. .. y z 
		
		*/
		
			
		for (int i = 'a'; i<='z'; i++) { 	// for döngüsü 'a' ve 'z' karakterinin sayısal değerini alarak sırasıyla getirir
			
			char alfabe=(char) i;			// i int bir değer oldugundan sahip olduğu değeri char a dönüştürüyoruz (conversion) 
			
			System.out.print(alfabe +" ");	
		}
		
	
	}

}
