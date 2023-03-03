import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args){
        Scanner sk =new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sk.nextInt();//546
        int revrese=0,rem;
        while(n!=0)//546!0=0    54!=0   5!=0
        {
            rem =n%10;//6=>  4   5
            revrese =(revrese*10)+rem;//(0*10)+6=6   =>(6*10)+4=>64  =>(64*10)+5=645
            n=n/10;//54 5 0

        }
        System.out.println("Reverse is "+revrese);
        }
    }

