package suthan;

class Book implements Runnable {
	
	public	void run(){
		for(int i =1 ; i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class King{
	
	void Queen(){
	for(int i=1;i<=5;i++) {
		System.out.println("Finished");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}
}
public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Runnable t = ()->{

			
				for(int i =1 ; i<=5;i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
		};
			King k = new King();
		Thread b = new Thread(t);
		
		b.setName("SUTHAN");
		
//		if(b.isAlive()) {
//			System.out.println("Raja");
//		}
		b.setPriority(Thread.MAX_PRIORITY);
		System.out.println(b.getPriority());
		b.start();
		k.Queen();
		
		
		b.join();
		k.join();
//		if(b.isAlive()) {
//			System.out.println("Raja");
//		}
//		
		System.out.println("Bye....");
		
	}

}
