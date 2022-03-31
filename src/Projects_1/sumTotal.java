package Projects_1;

public class sumTotal {
     /*
        Create String 2D array
        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
        if the String has $ multiply by 3.2
        if the String has € multiply by 4.2
        return the double
     */


    /*
        String 2D array oluştur
       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
       String de $ varsa 3.2 ile çarp
       String de € varsa 4.2 ile çarp
       double return et
    */
    public static void main(String[] args) {

//        Koda burdan başlayın
        String arr[][]={{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j<arr[i].length ; j++) {
                if (arr[i][j].substring(0,1).equals("$")){
                    System.out.println(Double.valueOf(arr[i][j].substring(1))*(3.2));
                }
                else if(arr[i][j].substring(0,1).equals("€")){
                    System.out.println(Double.valueOf(arr[i][j].substring(1))*(4.2));

                }

            }

        }




    }
}
