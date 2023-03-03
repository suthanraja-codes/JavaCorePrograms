package suthan;

class Outer{
	String o;
	void outerDisplay(){
		System.out.println("Suthan");
	}
	static class Inner{
		String s;
		void innerDisplay() {
			System.out.println("Raja");
		}
	}
}

public class Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o1 = new Outer();
		o1.outerDisplay();
		
		Outer.Inner i = new Outer.Inner();
		i.innerDisplay();
		

	}

}
