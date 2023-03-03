package suthan;
import java.lang.reflect.*;

public class Reflection{
	public static void main (String[] args) {
		Employee e = new Employee("Suthan",30000);
		
		Class cls = e.getClass();
		
		System.out.println("Class Name Is "+cls.getName());
		
		Method[] method =cls.getMethods();
		
		for(Method m1 :method) {
			System.out.println(m1.getName());
		}
		try {
			System.out.println(method[7].invoke(cls, null));
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}