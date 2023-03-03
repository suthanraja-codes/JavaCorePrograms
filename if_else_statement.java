import java.util.Scanner;

public class if_else_statement {
    public static void main(String[] args)
    {
        int year;
        System.out.println("Enter Year : ");
        Scanner sk = new Scanner (System.in);
        year = sk.nextInt();
        if(year%4==0 || year%100==0 && year%400==0)
        {
            System.out.println("Your"   + year +   "is leap Year");
        }
        else {
            System.out.println("is not leap year");
        }
    }
}
