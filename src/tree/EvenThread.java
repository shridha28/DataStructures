package tree;

public class EvenThread extends Thread {
	
	volatile boolean isEven = true;
	private int number ;
	
	EvenThread(boolean isEven,int number){
		this.isEven =  isEven;
		this.number = number;
	}
	
	public void run() {
		if(isEven) {
			System.out.println("I am even going in wait State");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+":"+number);
		isEven = false;
		notify();
		
	}

}
