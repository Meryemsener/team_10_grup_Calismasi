package Projects_1;
import java.util.Scanner;
public class diffBetweenMaxMin {
    private static int i;


    /*
    Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
    Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
    bigDiff([10, 3, 5, 6]) → 10-3 result = 7
    bigDiff([7, 2, 10, 9]) → 10-2 result = 8
    bigDiff([2, 10, 7, 1]) → 10-1 result = 9
    return type is int
     */

     /*
      Bir veya daha fazla öğe iceren int array verildiğinde, arraydeki en büyük ve en küçük öğeler arasındaki farkı return edin.
      Not: the built-in    Math.min(v1, v2) ve   Math.max(v1, v2) methodları en küçük ve en büyük öğeleri return eder.
    bigDiff([10, 3, 5, 6]) → 10-3 result = 7
    bigDiff([7, 2, 10, 9]) → 10-2 result = 8
    bigDiff([2, 10, 7, 1]) → 10-1 result = 9
    return tipi  int dir
     */

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String myStr = scan.nextLine();//Arrayda önce String deger olusturulur

            String[] strArr = myStr.split(" ");//mat işlem yapmak için boşluk ile Arrayleştiriyorum.Hala burası String alta gec

            int[] useThisArray = new int[strArr.length];//burda useThisArray ile strArr boyutunu esitlemeliyiz.int ile işleme cevirdim.
            //Kullanıcıdan aldığım String degerleri aşağıdakı for loop ıle integerleştiriyorum.
            for(int i = 0 ; i< strArr.length ; i++){
            //isırasıyla 0,1,2,3 ,4. duncude kırılacak
                int num =Integer.parseInt(strArr[i]);//10,3,5,6
                useThisArray[i] = num;//10,3,5,6

            }

            // Your code start here. Don't remove or change anything before this line. Your array is -> useThisArray in line 27
            // Kodlamaya burdan başla.Bu satırdan önceki satırlarda hiçbirşeyi kaldırma ve degiştirme. Kullanacağın array 27.ci satırda  --> useThisArray

           /* bigDiff([10, 3, 5, 6]) → 10-3 result = 7
            bigDiff([7, 2, 10, 9]) → 10-2 result = 8
            bigDiff([2, 10, 7, 1]) → 10-1 result = 9
            return tipi  int */

            int min = Integer.MAX_VALUE;//max alabilecegi en kucuk deger

            for( int i = 0 ; i < useThisArray.length ; i++){

                if(useThisArray[i] < min){
                    min = useThisArray[i];
                }
            }
            int max = 0 ;
            for( int i = 0 ; i < useThisArray.length ; i++){

                if(useThisArray[i] > max){
                    max = useThisArray[i];
                }
            }

            int result = max - min;
            System.out.println(result);

        }

        }

