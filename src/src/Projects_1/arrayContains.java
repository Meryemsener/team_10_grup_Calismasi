package src.Projects_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class arrayContains {
     /*
        Given two arrays of ints sorted in increasing order,
        outer and inner,
        return true if all of the numbers in inner appear in outer.
        Verify first array contains second array.
        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true
     */

    /*
         Artan düzende sıralanmış iki adet ınt array göz önüne alındığında,
 dış ve iç, içteki tüm sayılar dışta görünüyorsa true değerini döndürür.
İlk arrayin ikinci arrayi içerdiğini doğrulayın.
         linearIn([1, 2, 4, 6], [2, 4]) → true
         linearIn([1, 2, 4, 6], [2, 3, 4]) → false
         linearIn([1, 2, 4, 4, 6], [2, 4]) → true
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 elemanli String'in elemanlarini giriniz.");
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");

        int[] myArr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }

        Arrays.sort(myArr);
        System.out.println( "MyArr :" + Arrays.toString(myArr));

        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[2];

        for (int i = 0; i < 3; i++) {
            UseThisArray1[i] = myArr[i];
        }
        System.out.println("UseThisArray1 : " + Arrays.toString(UseThisArray1));

        for (int i = 3; i < 5; i++) {
            UseThisArray2[i - 3] = myArr[i];
        }
        System.out.println("UseThisArray2 : " + Arrays.toString(UseThisArray2));


        boolean isContain=true;

        List<Integer> outer = new ArrayList<>();

        outer.add(UseThisArray1[0]);
        outer.add(UseThisArray1[1]);
        outer.add(UseThisArray1[2]);

        System.out.println("Outher : " + outer);

        List<Integer> inner = new ArrayList<>();

        inner.add(UseThisArray2[0]);
        inner.add(UseThisArray2[1]);

        System.out.println("Inner : " + inner);

        if (outer.containsAll(inner)){
            System.out.println(isContain);
        } else System.out.println(!isContain);
}
    }