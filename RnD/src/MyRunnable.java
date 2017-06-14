
public class MyRunnable implements Runnable{
public void run() {
	go();
}

synchronized public void go() {
	doMore();
}
public void doMore(){
	System.out.println("On top of the Stack");
}
}

class ThreadTester {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread1= new Thread(myRunnable);
		Thread thread2= new Thread(myRunnable);
		thread1.start();
		thread2.start();
		System.out.println("Back in main");
	}
}