import java.util.Scanner;

public class group_switch {
    public static void main(String[] args)
    {
        char c;
        System.out.println("Enter The Character : " );
        Scanner sk = new Scanner (System.in);
        c=sk.next().charAt(0);
        switch (c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c +  "Vowels" );
                break;
            default:
                System.out.println(c +"Not A Vowel" );
                break;


        }


    }
}
