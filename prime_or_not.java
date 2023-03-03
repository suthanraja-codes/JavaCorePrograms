import java.util.Scanner;

public class prime_or_not {
    //prime or not program.
    public static void main(String[] args){
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sk.nextInt();
        int f=0; //factor
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                f++;
            }
        }if(f==2)
        {
            System.out.println("is prime");
        }else{
            System.out.println("not a prime");
        }
    }
}
