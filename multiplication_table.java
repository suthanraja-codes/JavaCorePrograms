import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args)
    {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter The Table : ");
        int t =sk.nextInt();
        System.out.println("Enter The Limit :");
        int n=sk.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(t + " X " + i +" = " +(t*i));
        }
    }
}
