import java.util.Scanner;

public class getting_inputs {
    public static void main (String[] args)
    {
        //a2+b2+2ab
       /* Scanner sk = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Two Numbers :");
        a=sk.nextInt();
        b=sk.nextInt();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Answer is "+c);
        "\n----------------------------------------------------------------"


        Scanner sk = new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter Two Numbers :");
        a=sk.nextFloat();
        b=sk.nextFloat();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Answer is "+c);


        Scanner sk = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter Two Numbers :");
        a=sk.nextDouble();
        b=sk.nextDouble();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Answer is "+c);

        */

        Scanner sk = new Scanner(System.in);
        String a,b;
        System.out.println("Enter Two Numbers :");
        a=sk.nextLine();
        b=sk.nextLine();
        System.out.println("Answer is "+a);
        System.out.println("Answer is "+b);

    }
}
