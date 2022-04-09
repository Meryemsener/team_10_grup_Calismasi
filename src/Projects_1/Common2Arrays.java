package Projects_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Common2Arrays {

/*
         Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
         Both arrays will be length 1 or more.
        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true
     */

    /*
        a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya
        aynı son öğeye sahiplerse true değerini döndürün.
        Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.
       commonEnd([1, 2, 3], [7, 3]) → true
       commonEnd([1, 2, 3], [7, 3, 2]) → false
       commonEnd([1, 2, 3], [1, 3]) → true
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 elemanli String array degerlerini giriniz");//burasi yok hocanin yazdigindakinde,
        // eklemeye yapmayinca kullanicinin kac eleman girecegi belli olmuyor.
        String myStr = scan.nextLine();// string olusturuluyor
        String[] arr = myStr.split(" ");// String Array olusturuluyor ve split ile rakamlar ayrilacak

        /*
        int olusturluyor cunku bir sonraki adimda String icerisinde yazilacak rakamlarin
        int degerleri elde edilecek ki rakamsal degerlerine ulasalim.
        burada boyutu belli ama icerisi bos olan bir myArr aciyoruz ki kullanici girdigi rakamlari
        buraya dahil edebilelim.
         */
        int[] myArr = new int[5];
        System.out.println(Arrays.toString(myArr));
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }
        System.out.println("MyArr : " + Arrays.toString(myArr));

        /*
        49-52 arasinda 2 int degeri olusturmamizi istiyor, burada da 3 ve 2 boyutlu
         olusturmus olduk. 2 ve 3 olmasinin nedeni, ayni zamanda yukarida int myArr'in 5
        boyutlu olmasi.
         */
        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[2];

        for (int i = 0; i < 3; i++) {
            UseThisArray1[i] = myArr[i];
        }
        System.out.println("UseThisArray1 : " + Arrays.toString(UseThisArray1));

        /*
        simdi asagida 3 dememizin nedeni biz yukarida degerleri kullanici tarafindan alinmis
        bes boyutlu bir array uzerinden islem yapiyoruz. UseThisArray1 ile ilk 3 elemani dahil ettik, kaldi geriye
        3.ve 4. indexteki elemanlar. bunun icin de baslangic noktamiz 3 olacak bitisimiz de 5ten kucuk olacak
        cunku ilk Array'in uzunlugu 5 ve ondan kucuk olmasi lazim. UseThisArray2[i-3] dememizin nedeni de 0, ve 1, indexi
        elde edebilmek.
         */
        for (int i = 3; i < 5; i++) {
            UseThisArray2[i - 3] = myArr[i];
        }
        System.out.println("UseThisArray2 : " + Arrays.toString(UseThisArray2));

        //KODLARI BURAYA KADAR HOCA YAZMIS ZATEN.

        List<Integer> outer = new ArrayList<Integer>();// list olusturarak eklemeyi yapmamiz kolaylasir.

        outer.add(UseThisArray1[0]);
        outer.add(UseThisArray1[1]);
        outer.add(UseThisArray1[2]);

        System.out.println("Outer : " + outer);

        List<Integer> inner = new ArrayList<>();

        inner.add(UseThisArray2[0]);
        inner.add(UseThisArray2[1]);
        System.out.println("Inner : " + inner);

        if(outer.get(outer.size()-1)==inner.get(1)){
            System.out.println("true");
        } else if(outer.get(0)==inner.get(0)){
            System.out.println("true");
        }else System.out.println("false");


    }

        }


