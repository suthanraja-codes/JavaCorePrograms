import java.util.Scanner;
public class deci2binary {
    public static void decimal2binary (int n){
        int numby[]=new int [1000];
        int i=0;
        while(n>0){
            numby[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>0;j--){
            System.out.println("Binary Num  : "+j);
        }

    }
    public static void main(String[] args){
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter The Decimal Number : ");
        int n=sk.nextInt();
        System.out.println("Decimal Num : "+n);
        decimal2binary(n);
    }
}
