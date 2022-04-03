package Projects_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class getTotal {

      /*
        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total
        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;
        NOTE : if the output less then 0 change output to -1
     */


    /*
    3 tane pozitif String verildiğinde
    sayısal olmayan tüm karakterleri kaldırın.
    Stringleri int e çevirin
    ve total print edin
        Ornek:
       String num1 = "$15";
       String num2 = "$20";
       String num3 = "$30";
       output ----> 65; olmali
       NOT : Eğer output 0 dan küçük ise outputu -1 e cevir
   */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String allElements = scanner.nextLine();
        String[] elements = allElements.split(" ");

        String num1 = elements[0];
        String num2 = elements[1];
        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        // String num1,num2,num3 kullanın

        List<String> list = new ArrayList<>(Arrays.asList(allElements.split(" ")));
        System.out.println("Girilen elemanlar : " + list);

        List<Integer> list2 = new ArrayList<>();

        int toplam = 0;
        int i = 0;
        do {
            elements[i] = elements[i].replaceAll("[%€$A-Za-z]", "");
            list2.add(Integer.parseInt(elements[i]));
            toplam += list2.get(i);
            i++;
        }
        while (i < elements.length);

        System.out.println("Sayisal olmayan degerlerin kaldirilmis hali : " + list2);

        if (toplam < 0) {
            System.out.println("-1");

        } else System.out.println("Toplam : " + toplam);

    }
}