import java.util.Scanner;

public class Armstrong_number {
        public static void main(String[] args)
        {
         Scanner sk = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int n=sk.nextInt();
            int temp=n;
            int digit1,digit2,digit3;

            digit1=temp%10;
            temp=temp/10;

            digit2=temp%10;
            temp=temp/10;

            digit3=temp%10;

            int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
            if(n==result)
            {
                System.out.println("arm");
            }else {
                System.out.println("not");
            }


        }
}
