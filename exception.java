package suthan;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;


public class exception {

	public static void main(String[] args) {
		int a = 19;
		int b = 0;
		int c = 0;
		//uncheacked
		 try{
			 c = a/b;
			 int arr[]=null;
			 arr[2]=1;
		
		 }
		
		 catch(Exception e) {
			 System.err.println("Error");
		 }
		 finally {
			 System.out.println("Suthan");
		 }
		 
		 
		 //cheacked
		 File file = new File("abc.txt");
		 
		 try {
			FileInputStream fd =new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		

	}

	
}
