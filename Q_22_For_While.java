package Java_Learning;

public class Q_22_For_While {

	public static void main(String[] args) {
		
		/* 
		 * 100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
			OUTPUT : 100 98 96 94 92 … … … … 2 0 
			
			*/
		

		for (int i = 100; i >=0; i-=2) {	// başlangıç değerini 100 verdik ve 2 azaltarak çift sayıları bulduk
			
			System.out.print(i + " ");
			
		}
		

	}

}
