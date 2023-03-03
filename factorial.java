import java.util.Scanner;

public class factorial {
    public static void main(String[] args)
    {
        System.out.print("Enter The Number : ");
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();//5
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;//1*1=1 1*2=2 1*3=3 1*4=4 1*5=5 total = 120 ellam f la store agum.
        }
        System.out.print("factorial of "+ n + " is "+ f);
    }

}
