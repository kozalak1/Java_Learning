package Java_Learning;

import java.util.Iterator;

public class Q_20_For_While {

	public static void main(String[] args) {
		/* Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

		Input :

		String str=“Javaisalsoeasy”

		Output: a s 
		
		*/

		String str="Javaisalsoeasy";
				
		String tekrarEden="";
		
		for (int i = 0; i < str.length(); i++) {
		
			
			
			if (str.substring(i+1).contains(charAt(i))) {
				tekrarEden.concat(charAt(i));
			}
	}
		
		System.out.println(tekrarEden);
	}

}
