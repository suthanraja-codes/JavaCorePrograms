import java.util.Scanner;

public class switch_case
{
    public static void main(String[] args)
    {
        int a,b,c,ch;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Divide");
        System.out.println("5.Modulus");
        Scanner sk = new Scanner(System.in);
        System.out.println("Selcet Your Choice :");
        ch = sk.nextInt();
        System.out.println("Enter Two Numbers : ");
       // System.out.println("Selcet Your Choice :"+ch);
        switch(ch)
        {
            case 1:
                //System.out.println("Enter Two Numbers : ");
                a = sk.nextInt();
                b = sk.nextInt();
                c = a + b;
                System.out.println("3.Multiplication" + c);
                break;
            case 2:
                //System.out.println("Enter Two Numbers : ");
                a = sk.nextInt();
                b = sk.nextInt();
                c = a - b;
                System.out.println("Subtracting  " + c);
                break;
            case 3:
                //System.out.println("Enter Two Numbers : ");
                a = sk.nextInt();
                b = sk.nextInt();
                c = a * b;
                System.out.println("Multiplication  " + c);
                break;
            case 4:
                //System.out.println("Enter Two Numbers : ");
                a = sk.nextInt();
                b = sk.nextInt();
                c = a / b;
                System.out.println("Dividing" + c);
                break;
            case 5:
                //System.out.println("Enter Two Numbers : ");
                a = sk.nextInt();
                b = sk.nextInt();
                c = a % b;
                System.out.println("Modulus" + c);
                break;
            default:
                System.out.println("Invalid Input");


        }
    }
}