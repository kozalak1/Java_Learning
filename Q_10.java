package Java_Learning;

public class Q_10 {

	public static void main(String[] args) {
		/* Girilen zamanı saniyeye çeviren bir program yazınız.

		Örnek Çıktı:

		1 saat 10 dakika 50 saniye ==>

		4250 saniye
		 				*/
		
		
		String time="1 saat 10 dakika 50 saniye";
		
		// System.out.println(time.replaceAll("\\D", "")); // 11050 // String //
		String newtime=time.replaceAll("\\D", "");
		
		String saat=newtime.substring(0,1);
		int newsaat=Integer.parseInt(saat);
		
		
		String dakika=newtime.substring(1,3);
		int newdakika=Integer.parseInt(dakika);
		
		String saniye=newtime.substring(3);
		int newsaniye=Integer.valueOf(saniye);
		
		
		int total=((newsaat*60*60)+(newdakika*60)+newsaniye);
		
		System.out.println(total + " saniye"); // 4250 saniye
		
	
		
		
	}

}
