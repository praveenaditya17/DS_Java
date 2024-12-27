package javaTest.Thread;

public class PrintEvenOdd {

	static int N;
	int count=1;
	public static void main(String args[]) {
		
		N=10;
		PrintEvenOdd a= new PrintEvenOdd();
		Thread th= new Thread(new Runnable() {
			@Override
			public void run() {
				a.printEven();
			}
		});
		Thread th2= new Thread(new Runnable() {
			@Override
			public void run() {
				a.printOdd();
			}
		});
			
		th.start();
		th2.start();
	}
	public void printEven() {
		synchronized (this) {
			while(count<N) {
				while(count%2!=0) {
					try {
						wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("even :"+count);
				count++;
				notify();
			}
		}
	}
	public void printOdd() {
		synchronized (this) {
			while(count<N) {
				while(count%2==0) {
					try {
						wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("odd :"+count);
				count++;
				notify();
			}
		}
	}
}
