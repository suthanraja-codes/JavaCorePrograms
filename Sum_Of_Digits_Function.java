
public class Sum_Of_Digits_Function {
	static int sumofdigits (int a,int b, int c ){
		
		int d ;
		d = a+b+c;
		return d;
	}
	static void printline(){
		System.out.println("-----------------------------------------------------------");
	}
	public static void main (String args[]) {
		printline();
		sumofdigits(3,4,5);
		System.out.println(sumofdigits(3,4,5));
		printline();
		
		sumofdigits(12,34,78);
		System.out.println(sumofdigits(12,34,78));
		printline();
		
		sumofdigits(90,75,12);
		System.out.println(sumofdigits(90,75,12));
		printline();
		
		
		sumofdigits(16,27,49);
		System.out.println("sum = "+sumofdigits(16,27,49));
		printline();
	}
}
