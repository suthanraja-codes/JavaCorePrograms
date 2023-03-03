package suthan;

class Department implements Cloneable{
	int DepId;
	String Dep;
	Department(int i,String D){
		
		DepId = i;
		Dep = D;
	
	}
	void display() {
		System.out.println("Department Name : "+Dep);
		System.out.println("Department Id : "+DepId);
	}
//	void Department (Department s5){
//		this.DepId = s5.DepId;
//		this.Dep=s5.Dep;
//		
//		
//	}
	protected	Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
class Student implements Cloneable{
	int Rollno;
	String Name ;
	int year;
	Department dept;
	Student(int r , String n,int y ,Department de){
		Rollno = r;
		Name = n;
		year = y;
		dept = de;
		
	}
	void display() {
		System.out.println("Student Rollno : "+Rollno);
		System.out.println("Student Name : "+Name);
		System.out.println("Student Year : "+year);
		dept.display();
	}
	
	Student(Student s5){
		this.Rollno = s5.Rollno;
		this.Name = s5.Name;
		this.year = s5.year;
		
	}
	protected	Object clone() throws CloneNotSupportedException {
		Student s5 = (Student)super.clone();
		s5.dept=(Department)s5.dept.clone();
		return s5;
	}
	
	
	
}

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Department d = new Department(1,"Computer Science");
		Student s = new Student (9197,"Suthan",3, d);
		Student s3 = (Student)s.clone();
		//d.display();
//		d.Dep="maths";
//		s.display();
////		Student s2 = new Student (9198,"Raja",3, d);
////		s2.display();
//		System.out.println("-------------------------------------------------------------------------------------------------------------");
//		s3.display();
		
		Student s5 = new Student(s);
		s5.display();
		
		
		

	}

}
