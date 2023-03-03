import java.util.Scanner;
public class EStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0,n ,i,j;
		Scanner suthan = new Scanner (System.in);
		System.out.println("Enter The Last Number : ");	
		n = suthan.nextInt();
		for( i = 1; i<=n ;i++) {
			for( j=1;j<=i;j++) {
				if(i%j==0) {
					++f;
				}
				}
			if(f==2) {
				System.out.println(i+" is prime");
				}
			f=0;
		
		
		}
		

	}

}
