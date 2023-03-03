class Methods{
    public  int factorial(int n)//5!  =1*2*3*4*5=120
    {
        if(n==1)
            return 1;
        else
            return (n*factorial(n-1)); //5*4*3*2*1=120
    }
}
public class recursion {
    public static void main(String args[]) {
        Methods o = new Methods();
        System.out.println("factorial : "+o.factorial(5));

    }
}
