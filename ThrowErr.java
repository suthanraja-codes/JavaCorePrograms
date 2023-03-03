package suthan;

public class ThrowErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double amount = 1000 , withdraw = 2000;
		
		try {
			if(amount<withdraw) {
				throw new InsufficientError(withdraw-amount);
			}
		}
		catch(InsufficientError e) {
			System.err.println("Error");
		}

	}

}
