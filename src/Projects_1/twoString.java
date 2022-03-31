package Projects_1;


import java.util.Scanner;

public class twoString {
    public static void main(String[] args) {

        /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.
            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */


        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .
        Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın
       Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */

        // code start here use s1 and s2 as words
        // kodu burdan başlatın ve s1 ve s2 kelime olarak kullanın
        Scanner scanner = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String ilkKelime = scanner.next();
        System.out.println("ikinci kelimeyi giriniz");
        String ikinciKelime = scanner.next();
        if (ilkKelime.substring(ilkKelime.length() - 1, ilkKelime.length()).equals(ikinciKelime.substring(0, 1))) {
            System.out.println(ilkKelime.replace(ilkKelime.substring(ilkKelime.length() - 2, ilkKelime.length() - 1), "") + ikinciKelime);

        } else {
            System.out.println(ilkKelime + ikinciKelime);

        }


    }

}
