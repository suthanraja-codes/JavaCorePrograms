import java.util.Scanner;

public class Scanner_class {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter A :");
        a=sk.nextInt();
        System.out.println("Enter B :");
        b=sk.nextInt();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Total "+ c);

    }
}
