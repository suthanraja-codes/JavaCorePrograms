
public class fibbanaci_recursion {
	
	static int fib(int a){
		
		if(a==0)
			return 0;
		if(a==1 || a==2) {
			return 1;
		}
		else
			return fib(a - 1) + fib(a-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		System.out.println("The Number Of " + a + " Fibanacci Serious Is : ");
		for (int i=0;i<=a;i++) {
			System.out.print(fib(i)+" ");
		}
	}

}
