
public class Main {

	public static void main(String[] args) {
		
		Thread th1 = new Thread(new FactorialThread(4000));
		Thread th2 = new Thread(new FactorialThread(4000));
		Thread th3 = new Thread(new FactorialThread(4000));
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(Thread.currentThread().getName() + " is STOP!");

	}

}
