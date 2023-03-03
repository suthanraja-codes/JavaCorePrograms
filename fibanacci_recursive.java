
public class fibanacci_recursive {
	int i;
	
	static int fibanacci(int n){
		
        for(int i=0;i<=n;i++)
        {
        	int a=-1,b=1,c;
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            
        }
       
       
        return n;
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n = 10;
	System.out.println(n);

	}

}
