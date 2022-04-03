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

        System.out.println("Arrayin ilk elemani : " + num1);
        System.out.println("Arrayin ikinci elemani : " + num2);
        System.out.println("Arrayin ücüncü elemani : " + num3);

        List<String> list = new ArrayList<>(Arrays.asList(allElements.split(" ")));
        System.out.println("List : " + list);

        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        int toplam = 0;
        int i = 0;
        do {
                elements[i] = String.valueOf(Integer.parseInt(num1.replaceAll("[€$A-Za-z]", "")));
                list2.add(Integer.parseInt(elements[i]));
                toplam += list2.get(i);

                if (toplam<0{}
            //elements[i] = list.get(i).replaceAll("\\D", "");
            }
            while (i < elements.length) ;


//elements[i] = list.get(i).replaceAll("\\D", "").trim();


//
//            if (list.get(i).contains("-")) {
//                elements[i] = list.get(i).replaceAll("\\D", "").trim();
//                list2.add(Integer.valueOf(Math.abs(list2.get(i))));
//                toplam += Math.abs(list2.get(i));
//                System.out.println("Negatif sayilar liste : " + list2);
//            }
//        }
//
//        System.out.println("Negatif sayilarin toplami : " + toplam);


//        for (int j = 0; j < list.size(); j++) {
//            if (!list.get(j).contains("-")) {
//                elements[j] = list.get(j).replaceAll("\\D", "").trim();
//                list3.add(elements[j]);
//                toplam += Integer.valueOf(list3.get(j));
//            }
//        }
//        System.out.println("Sayisal olmayan karakterlerin kaldirilmis hali : " + list3);
//        System.out.println("Sayisal degerlerin toplam : " + toplam);

        }
    }