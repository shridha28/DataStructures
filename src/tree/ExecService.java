package tree;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService ex1 = Executors.newFixedThreadPool(10);
		
		/*
		 * for(int i= 35;i<67;i++) {
		 * 
		 * ex1.execute(new Runnable() { public void run() { try { Thread.sleep(1000); }
		 * catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * System.out.println(Thread.currentThread().getName()+":I love multithreading"
		 * ); } });
		 * 
		 * } ex1.shutdown();
		 */
		
		
	Future future =	ex1.submit(new Callable() {
			public Child call() {
				try {
					Thread.sleep(1000);
					Child child = new Child();
					return child;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
		});
	 Child child = (Child) future.get();
	 System.out.print(child.getPrice());
	
		ex1.shutdown();
		
		
		
	}
}
