import java.util.Scanner;

public class fibanacci {
    public static void main(String[] args)
    {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sk.nextInt();
        int a=-1,b=1,c;
        for(int i=0;i<=n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
