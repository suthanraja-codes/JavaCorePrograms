package suthan;

public class Employee {
	String name;
	double salary;
	
	Employee(String n ,double s){
		name = n;
		salary =s;
	}
	Employee(){
		name = "";
		salary =0.0;
	}
	
	 String getName (){
		 return name;
	 }
	 void setName(String n) {
		 name =n;
	 }
	 double getSalary() {
		 return salary;
	 }
	 void setSalary(double s) {
		 salary = s;
	 }
	 void bonus(double percentage) {
		 salary = salary + salary*percentage/100;
	 }
}
	class Manager extends Employee{
		 double mbonus;
		 Manager(String n,double s,double b){
			 super(n,s);
			 mbonus = b;
		 }
		 void setBonus(double b) {
			 mbonus = b;
		 }
		  double getBonus() {
			 return mbonus;
		 }
		 public double setSalary() {
			 return super.getSalary()+mbonus;
		 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee i1 = new Employee("suthan",2500);
		i1.bonus(10);
		System.out.println(i1.getSalary());
		
		Manager m1 = new Manager("Raja",60000,0.0);
		System.out.println(m1.getSalary());
		

	}

}
