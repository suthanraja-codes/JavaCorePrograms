import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Single_Array {
    public static void main(String[] args){
      /*  int b[]={10,20,30,40,50,60,70,80,90,100};
        System.out.println(b[2]);
        System.out.println("Enter The Number :");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        for(int element : b){
            System.out.println(element);
        }
    }//int c[]=new int[10];//combining both statement

    //int d[]; declaring array
    //int []d=new int [10] allowcating memory to array

    */
        int c[]=new int[5];
        for(int j=0;j<5;j++){
            Scanner sk=new Scanner(System.in);
            System.out.println("Enter The Number  :");
            c[j]=sk.nextInt();
        }
        for (int element : c){
            System.out.println(element);
        }
    }

}
