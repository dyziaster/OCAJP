package CH_threads;

import java.util.ArrayList;
import java.util.List;

class Storage{
	
		private List<Integer> list = new ArrayList<Integer>();
		
		public synchronized void addNumber(int number){
			
			list.add(number);
			System.out.println("added "+number+(" to array"));
			notify();
		}
		
		public synchronized Integer getNumber(){
			try {
				while(list.isEmpty())
					wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return list.remove(list.size()-1);
		}
		
		public List<Integer> getList(){
			return list;
		}
			
}

class Counter implements Runnable{
	
	Storage s;
	
	public Counter(Storage s){
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<100;i++){
			
			s.addNumber(i);
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	
	
}


class Printer implements Runnable{
	
	Storage s;
	
	public Printer(Storage s){
		
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;;){
			
			System.out.println(s.getNumber());
			
		}
		
	}
	
	
	
	
}


public class Ex13_1 {
	
	public static void main(String args[]) throws InterruptedException{
		
		Storage s = new Storage();
		Counter c = new Counter(s);
		Counter c2 = new Counter(s);
		Printer p = new Printer(s);
		
		Thread t1 = new Thread(c);
		Thread t3 = new Thread(c2);
		Thread t2 = new Thread(p);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.start();
		t1.join();
		t3.join();
		System.out.println(s.getList());
		
		
	}

}
