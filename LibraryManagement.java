class library{
	String Name ;
	int Class;
	int Age ;
	String Password;
	
}
class book{
	String Name ;
	String BookName;
	int Days;
}
class card{
	int Afterdays;
	int payment;
}


public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		library user;
		user = new library();
		user.Name = "Suthan";
		user.Class = 12;
		user.Age=21;
		user.Password="Suthan@2002";
		
		book blue = new book();
		blue.Name = "SUthan";
		blue.BookName = "Chekuvara";
		blue.Days = 20;
		
		card afterdays = new card();
		afterdays.Afterdays = 25;
		afterdays.payment = 200;
		
		System.out.println(user.Name);
		System.out.println(user.Class);
		System.out.println(user.Age);
		System.out.println(user.Password);
	
		
	}

}
