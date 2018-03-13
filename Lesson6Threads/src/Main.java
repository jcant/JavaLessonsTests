
public class Main {

	public static void main(String[] args) {
		
		//Thread th1 = new Thread(new FactorialThread(4000));
		//Thread th2 = new Thread(new FactorialThread(4000));
		//Thread th3 = new Thread(new FactorialThread(4000));
		
		//th1.start();
		//th2.start();
		//th3.start();
		//th1.run();
		//th2.run();
		//th3.run();
		
		
		FactorialThread fth1 = new FactorialThread(4000);
		fth1.run();
		
		System.out.println(Thread.currentThread().getName() + " is STOP!");

	}

}
