
public class bool_functon_of_two_digit {
static int twodigit(int a){
	int b , c , d , e;//59
	
	
	b=a%10;//9
	c=a/10;//5
	d =c%10;
	e = b*1 + d*10;
	int m = 3;
	if(e==a) {
		return m;
	}
	else {
		return a;
	}
	
	
	
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(twodigit(12000 
				));
	}

}
