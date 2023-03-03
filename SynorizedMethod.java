package suthan;

class Table{
	
	synchronized void printTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class SynorizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table t = new Table();
		
//		t.printTable(5);
		
		Thread t1 = new Thread() {
			public void run() {
				t.printTable(10);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				t.printTable(5);
			}
		};
		
		t1.start();
		t2.start();
		
//		t1.start();
		
		

	}

}
