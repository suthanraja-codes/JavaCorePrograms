
//
//public class prime_1_to_100 {
//    public static void main(String[] args){
//
//      int f=0;
//      for(int n=1;n<=999;n++)
//      {
//          for(int i=1;i<=n;i++)
//          {
//              if(n%i==0){
//                  f++;
//              }
//
//          }if(f==2){
//          System.out.println(n +"is a prime number");
//      }
//          f=0;
//      }
//    }
//}

import java.util.Scanner;

public class prime_1_to_100 {
    public static void main(String[] args) {

        Scanner sk = new Scanner(System.in);
        int i , n , f=0;
        System.out.println("Enter The Number : ");
         n = sk.nextInt();
         i = 1;

        while(i<=n){
            int j=1;
            while(j<=i){
            if(i%j==0){
                f++;
            }
                j++;
            }
            i++;
        }if(f==2) {
			System.out.println(i+" is prime");
			f=0;}
            if(f==2){
                System.out.println(i + " is prime");

            }
                f =0;





    }
}
