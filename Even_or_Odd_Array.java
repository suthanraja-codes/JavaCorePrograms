import java.util.Scanner;

public class Even_or_Odd_Array{
    public static void main(String[] args){
        int e=0,o=0;
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sk.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter The NUmber a[ " + i +  "] : ");
            a[i]= sk.nextInt();
        }for (int element : a)
        {
            if(element%2==0){
                e++;
            }
            else{
                o++;
            }

        }
        System.out.println(e++);
        System.out.println(o++);

    }
}
