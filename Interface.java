

/*
 * Interface - interface is a what to do but not how to do 
 * 
 * version 1.8 before declaration only
 * 
 * version 1.8 after declaration only
 * 
 * 
 * Functional Interface (or) SAM - Single Abstract Method Interface
 * 
 * Functional Interface - lambda Expression
 * 
 * */

interface  Vechicle{//instance variable
	int speed = 80 ; // final , static
	void ride();
	default void display() {
		System.out.println("My Name Is Suthan Raja");
	}
	
	
}
class Bike implements Vechicle{
	
	public void ride() {
		System.out.println("You Ride Bike");
	}
	public void display() {
		System.out.println("My Name Is King");
	}
	
}
class Car implements Vechicle {
	public void ride() {
		System.out.println("You Ride Car");
	}
	
}
class Mechanic{
	
	void cheack(Vechicle v) {
		System.out.println("Cheacking....");
			v.ride();
	}
	
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mechanic m = new Mechanic();
		Car car = new Car();
		Bike bike = new Bike();
		
		car.display();
		bike.display();
		m.cheack(car);
		
		Vechicle v1 = new Vechicle(){
			
			public void ride() {
				System.out.println("You Ride Truck");
			}
			
		};

		v1.ride();
		
		// Lambda Expression - Functional Expression
		
		Vechicle v2 = ()->System.out.println("You Ride Train...");
		
		v2.ride();

	}

}
