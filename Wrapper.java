package suthan;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		float f = 5;
		
		Float f2 = Float.valueOf(17); // Boxing , Wrapping 
		
		Integer i2 = Integer.valueOf(20);
		
//		Float f3 = 27.34;
		
		Integer i3 = 27; //Auto Boxing
		
		int i4 = i3.intValue(); // UnBoxing
		
		int i5 = i3; //auto unboxing
		
		String s = "1234";
		
		int a =Integer.parseInt(s);
		
		System.out.println(a);
		
		
		

	}

}
