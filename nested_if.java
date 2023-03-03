import java.util.Scanner;

public class nested_if {
    public static void main(String[] args )
    {
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter Your Marital Status M/U :");
        char marital =sk.next().charAt(0);
        if(marital=='u' || marital=='U' )
        {
            System.out.println("Enter Your Gender M/F:");
            char gender = sk.next().charAt(0);
            System.out.println("Enter Your Age :");
            int age = sk.nextInt();
            if((gender == 'm'  || gender == 'M' ) &&  (age>=30))
            {
                System.out.println("you are eliible for insurance");
            }
            else if ((gender=='f'  || gender=='F'  ) && (age>=25))
            {
                System.out.println("you are eliible for insurance");
            }
            else
            {
                System.out.println("you are not eliible for insurance");
            }

        }
        else if (marital =='m'  || marital=='M')
        {
            System.out.println("your Are eligible for insurance");
        }
        else
        {
            System.out.println("invalid input");
        }
    }
}
