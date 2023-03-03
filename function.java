import java.util.Scanner;
import java.util.Arrays;

public class function {
    public static int[] SortArray() {
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter The LImit :");
        int n = sk.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter The Value " + i + ":");
            a[i] = sk.nextInt();
        }
        Arrays.sort(a);
        return a;

    }
    public static void main(String[] args){
        int blue[]=SortArray();
        for (int a : blue)
            System.out.println(a);
    }
}