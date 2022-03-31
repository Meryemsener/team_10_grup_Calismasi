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

        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        // String num1,num2,num3 kullanın


        System.out.println("Arrayin ilk elemani : " + num1);
        System.out.println("Arrayin ücüncü elemani : " + num3);
        List<String> list = new ArrayList<String>(Arrays.asList(allElements.split(" ")));
        System.out.println("List : " + list);
        List<String> list2 = new ArrayList<>();
        int toplam = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("-")) {
                System.out.println("-1");
                break;
            } else {
                elements[i] = list.get(i).replaceAll("\\D", "").trim();
                list2.add(elements[i]);
                toplam += Integer.valueOf(list2.get(i));
            }
        }
        System.out.println("Sayisal olmayan karakterlerin kaldirilmis hali : " + list2);
        System.out.println("Sayisal degerlerin toplam : " + toplam);
    }
}


