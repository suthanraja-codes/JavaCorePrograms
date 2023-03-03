import java.util.Scanner;

public class else_if {
    public static void main(String[] args)
    {
        float m;
        System.out.println("Enter your mark :");
        Scanner sk = new Scanner (System.in);
        m=sk.nextFloat();
        if(m>=90 && m<=100)
        {
            System.out.println("Grade a");
        }
        if(m>=80 && m<90)
        {
            System.out.println("grade b");
        }
        if(m>=70 && m<80)
        {
            System.out.println("grade c");
        }
        else
        {
            System.out.println("grade d");
        }
    }

}
