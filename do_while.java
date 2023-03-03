import java.util.Scanner;

public class do_while
{
    public static void main(String[] args)
    {
        System.out.println("Enter The Character : " );
        Scanner sk = new Scanner(System.in);
        int a=sk.nextInt();
        int i=1;
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<=a);


    }
}
