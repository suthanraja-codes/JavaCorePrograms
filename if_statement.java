import java.util.Scanner;

public class if_statement {
    public static void main(String[] args)
    {
        int  age;
        System.out.println("Enter Your age :");
        Scanner sk = new Scanner (System.in);
        age=sk.nextInt();
        if(age>=18)
        {
            System.out.println("You are Eligibile For Vote");
        }


    }
}
