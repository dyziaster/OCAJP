package CH_threads;

class Mutex implements Runnable{

	private int counter = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<10;i++){
			System.out.println(counter);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter++;
		}
		
	}
	
	public int getCounter(){
		return counter;
	}
		
}


public class Main{


	public static synchronized void main(String args[]) throws InterruptedException{

		
		Thread t1 = new Thread();
		t1.start();
		int t = 2;
		System.out.println("x");
		t1.wait();
		Thread.sleep(10000);
		System.out.println("y");
	}
	
	

}
