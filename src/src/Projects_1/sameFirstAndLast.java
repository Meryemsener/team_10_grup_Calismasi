package src.Projects_1;
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

        if(useThisArray[0].equals(useThisArray[useThisArray.length-1])){
        //eger arryimin ilk indexi[0]esitse(.equals)son[arrayim.length-1] indexine
            System.out.println("true");// true yazsin
        }else{                      //  esit edilse
            System.out.println("false"); // false yazsin
        }
    }
}
