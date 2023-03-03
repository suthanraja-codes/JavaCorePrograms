import java.util.Scanner;
public class perfact_number {
    public static void main (String[] args)
    {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter The Numbr :");
        int n=sk.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%n==0) // 1%10 2%10 5%10
            {
                sum+=i; // 1 + 2 + 5 
            }
        
        if(sum==n)
    {
        System.out.println(n +" perfact number");
    }
        else
        {
        System.out.println(n +" not a perfact numbre");
    
        }
    }

}}
