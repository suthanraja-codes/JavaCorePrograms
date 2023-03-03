import java.util.Scanner;

public class for_loop {
    public static void main(String[] args)
    {
        System.out.println("Enter The Character : " );
        Scanner sk = new Scanner(System.in);
        int a=sk.nextInt();
        for(int i=2;i<=a;i+=2)
        {
            System.out.println(i);
        }
    }
}
