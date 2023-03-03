import java.util.Scanner;

public class factors {
    public static void main(String[] args)
    {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sk.nextInt();
       // System.out.println("Enter The Number : ");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i + " ");
            }
        }
    }
}
