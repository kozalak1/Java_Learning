package Java_Learning;

public class Q_16 {

	public static void main(String[] args) {
		
		
		/* 2 kelime oluşturun: isim1 ve isim2

	    // isim1 çift sayıda karakter içeriyorsa,

	    // ikinci kelimeyi ilk adın ortasına yerleştirin

	    // ilk kelime tek sayida karakter iceriyorsa

	    // “isim1, isim2 ye eklenemiyor” yazdırın

	    // Örneğin:
	    // isim1= mehmet
	    // isim2= ahmet
	    // Yazdır ==> mehahmetmet

	    // isim1= memet
	    // isim2= ahmet
	    // Yazdır ==> isim1, isim2 ye eklenemiyor */
		
		
		String isim1="Cumali";
		
		String isim2="Cemal";
		
		if (isim1.length()%2==0) {
			
			String yeniAd1=isim1.substring(0, isim1.length()/2);
			
			String yeniAd2=isim1.substring(isim1.length()/2);
		
			String yeniAd=yeniAd1.concat(isim2+yeniAd2);
			
			System.out.println(yeniAd);
			
		} else {

			System.out.println("isim1, isim2 ye eklenemiyor");
			
		}
		
		
		
	}

}
