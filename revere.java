import java.util.Scanner;

public class revere {
    public static void main(String [] args)
    {
        System.out.println("Enter The Number : ");
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();//123
        int a=n%10;//3
        int b=a%10;//2
        int c=b%10;//1
        int d=a*100;//300
        int e=b*10;//20
        int f=c*1;//1
        int g=d+e+f;
        System.out.println(g);

    }
}
