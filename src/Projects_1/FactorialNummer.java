package Projects_1;
import java.util.Scanner;
public class FactorialNummer {
    public static void main(String[] args) {

        /*
        Write a program to find the factorial value of any number entered through the scanner class.
        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040
        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720
       */

        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.
        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720
         */

        Scanner dp = new Scanner(System.in); // kullanici dan sayi alma

        String  strNum = dp.nextLine(); // atama

        int number = Integer.parseInt(strNum); // strign i int e cevirme (.parseInt) ve atama yapildi

        //      code start here  use int number
        //      kodu burdan başlatın ve int number kullanın
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int faktöriyel=1;
        String faktoriyelAcikYazim = "";
        for (int i = sayi; i >= 1; i--) {
            faktöriyel*=i;

            if (i == sayi) {
                faktoriyelAcikYazim = faktoriyelAcikYazim + i;
            } else
                faktoriyelAcikYazim = faktoriyelAcikYazim + "*" + i;
        }
        System.out.println(sayi + "! = " + faktoriyelAcikYazim + " =" + faktöriyel);


    }

}
