package suthan;

public class InsufficientError extends Exception {
	double Amount;
	InsufficientError (double a){
		Amount = a;
	}
}
