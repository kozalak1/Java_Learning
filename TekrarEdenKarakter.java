package Java_Learning;

public class TekrarEdenKarakter {

  /*  3- Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
    Input :
    String str= “Javaisalsoeasy”
    Output: a s
         */

    public static void main(String[] args) {


        String str = "Javaisalsoeasy";
        String str1 = " ";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j) && !str1.contains(str.substring(i, i + 1))) {
                    str1 += str.charAt(i) + " ";
                }
            }
        }

        System.out.println(str1);
    }
}

