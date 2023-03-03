import java.util.Scanner;

public class sum_average{
    public static void main(String[] args)
        {
        Scanner sk=new Scanner(System.in);
            System.out.print("Enter the Limit : ");
            int n=sk.nextInt();
            int sum=0,a;
            for(int i=1;i<=n;i++)
            {
                System.out.println("Enter the number " + i + ":");
                a=sk.nextInt();
                sum+=a;
            }
            System.out.println("sum of these numbers : " +sum);
            System.out.println("ave of these numbers : " +sum/n);

    }

    }


