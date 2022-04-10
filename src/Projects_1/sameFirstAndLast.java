package Projects_1;
import java.util.Arrays;
import java.util.Scanner;
public class sameFirstAndLast {
     /*
    Given an array of ints, print true if the array is length 1 or more, and the first element and the last element are equal.
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true
    print just true or false
    */
    /*
    Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse true değerini yazdırın.
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true
    sadece  true veya false print et
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split("");// burada atanan arryimi [-,-,-,-] gibi ayirdima yapildi

        //  code start here
        // Koda burdan başlayin


        System.out.print("Eleman sayisi giriniz : ");
        int elemanSayisi = scan.nextInt();   // --> eleman sayisini aldik. Scanner oldugu icin eleman sayisi dinamik oldu.
        int[] arr = new int[elemanSayisi]; // --> eleman sayisini kullanarak dinamik bir array olusturuldu
        for (int i = 0; i < elemanSayisi; i++) {   //// --> döngü eleman sayisindan kücük oldugu sürece
            System.out.print(i + 1 + ". elemani giriniz : ");
            int elemanlar = scan.nextInt(); // --> Tek tek elemanlar girildi
            arr[i] = elemanlar; //--> array indexine eleman atamalari yapildi
        }
        System.out.println("Arr arrayi : " + Arrays.toString(arr));
        boolean esitMi = true; // --> true false yazdirmak icin boolean olusturuldu
        if (arr.length >= 1 && arr[0] == arr[arr.length - 1]) {  //--> arr 1 elemanden fazlaysa VE ilk eleman ile
            System.out.println(esitMi);                          //son eleman eitse true return edildi
        } else System.out.println(!esitMi);
    }
}
