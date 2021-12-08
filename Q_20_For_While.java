package Java_Learning;

import java.util.Iterator;
import java.util.Scanner;

public class Q_20_For_While {

	public static void main(String[] args) {
	
		/* Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

		Input :

		String str=“Javaisalsoeasy”

		Output: a s 
		
		*/

				
		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen bir cumle yazınız :");
		String str=scan.nextLine();
					
		String tekrarEden=" ";
		
		for (int i = 0; i < str.length(); i++) {
		
			if (str.substring(i+1).contains(str.substring(i, i+1))) {
				
				if (!tekrarEden.contains(str.substring(i, i+1))) {
					
					tekrarEden=tekrarEden+str.charAt(i)+ " ";
				}
			
			}
	}
		
		 System.out.print(tekrarEden); 
		 
		 scan.close();
	}

	
}
