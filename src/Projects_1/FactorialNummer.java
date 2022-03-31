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
        int faktoriyel=1;
        // faktoriyel islemler 1 den basladigi icin atama 1 den baslar. gibi (factorial:1*2*3*4*5*6=720)
        for (int i = 1; i <=number ; i++) {
         //(islem) 1 den basladi ; scan ile aldigimiz sayi ya esit olana kadar (kosul); artma olur
            faktoriyel*=i;// her dongude i artarak carpma islemi ve atama olur
        }
        System.out.println(faktoriyel);
        
    }

}
