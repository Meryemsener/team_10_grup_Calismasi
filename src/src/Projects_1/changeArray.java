package src.Projects_1;

import java.util.Scanner;

public class changeArray {
     /*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple
        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange
        Result should be Peach , Berry , Apple , WaterMelon , Apple
        Print the Array
     */


    /*
       String bir array verildiğinde
       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevir
       Örnek:
       Array : Peach , Berry , Orange , WaterMelon , Orange
       Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple
       Arrayi print edin
     */


//        Koda burdan başla
//        kullanman gereken -> UseThisArray

        public static void main (String[]args){

            Scanner scan = new Scanner(System.in);

            System.out.println("Lutfen meyve isimleri giriniz");

            // myStr = input, UseThisArry= fruits


            String input = scan.nextLine();
            String[] fruits = input.split(" ");
            // String[] out

            for (int i = 0; i < fruits.length; i++) {

                if (fruits[i].toLowerCase().equals("orange")) {
                    fruits[i] = "Apple";
                }

            }

            for (int i = 0; i < fruits.length; i++) {

                if (i == fruits.length - 1) {
                    System.out.print(fruits[i] + " ");
                } else {
                    System.out.print(fruits[i] + " , ");
                }

            }

        }
    }


