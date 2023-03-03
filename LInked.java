package suthan;
import java.util.*;

public class LInked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] =new int [4];
		
		a[0]=1;
		a[1]=2;
		a[3]=3;
//		a[4]=4;
		
		for(int f :a ) {
			System.out.println(f);
		}
		
		ArrayList b = new ArrayList();
		
		b.add("suthan");
		b.add(1);
		b.add('s');
		
		System.out.println(b);
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		
		c.add(1);
		c.add(1);
		c.add(1);
		c.add(1);
		
		for(int d : c) {
			System.out.println(d);
		}
		
		Iterator<Integer> e =  c.iterator();
		
		while(e.hasNext()) {
		System.out.println(e.next());
		
		}
		
		LinkedList <Integer>  ll = new LinkedList <Integer>();
		
		ll.add(12);
		ll.add(23);
		ll.add(24);
		ll.add(45);
		ll.add(9);
		
		for (int bb :ll) {
			System.out.println(bb);
		}
		

	}

}
