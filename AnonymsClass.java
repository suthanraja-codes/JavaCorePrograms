/*
 * 
 * NameLess Function is Anonysms Function
 * 
 * */

package suthan;

class bike{
	void display() {
		System.out.println("I Buy a New Bike..");
	}
}


public class AnonymsClass {
	public static void main (String[] args) {
		bike b = new bike() {
			
				void display() {
					System.out.println("I Buy a New Car..");
				}
			
			
		};
		b.display();
	}

}
