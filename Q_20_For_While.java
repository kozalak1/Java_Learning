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
					
		String tekrarEden=" "; // tekrar eden karakterleri atamak için boş bir string(tekrarEden) oluşturduk
		
		for (int i = 0; i < str.length(); i++) {	// kullanıcının girdiği cümlenin başından sonuna doğru gittik
		
			if (str.substring(i+1).contains(str.substring(i, i+1))) { 	// girilen cümlenin 2. karakterinden sonrası ilk karakteri içeriyor mu? evetse;   
	
				
				if (!tekrarEden.contains(str.substring(i, i+1))) { 		// "tekrarEden" de bu karakteri içermiyorsa;
					
					tekrarEden=tekrarEden+str.charAt(i)+ " ";			// bu karakteri tekrarEden e ekle
				}
			
			}
	}
		
		 System.out.print(tekrarEden); 
		 
		 scan.close();
	}

	
}
