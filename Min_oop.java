
public class Min_oop {
	
	static double min_value(double... vals) {
		double min = Double.MAX_VALUE;
		for(double k:vals) {
			if(k<min) {
				min = k;
			}
		}return min;
	}

	static int min_value2(int...  vals) {
		int min2 = Integer.MAX_VALUE;
		for (int l : vals) {
			if(l<min2) {
				min2 = l;
			}
			
		}
		return min2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m = min_value(3.3,5.6,9.7);
		System.out.println(m);
		
		int n = min_value2(2,4,5,6,78);
		System.out.println(n);
		
		double o = min_value();
		System.out.println(o);

	}

}
