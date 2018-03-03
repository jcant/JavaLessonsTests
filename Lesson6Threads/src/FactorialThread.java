import java.math.BigInteger;

public class FactorialThread implements Runnable{

	private int number;

	public FactorialThread() {
		super();
	}

	public FactorialThread(int number) {
		super();
		this.number = number;
	}

	private BigInteger calculateFactorial(int number) {
		BigInteger fact = new BigInteger("1");
		
		for(int i=2; i<=number; i+=1) {
			fact = fact.multiply(new BigInteger(""+i));
		}
		
		return fact;
	}
	
	@Override
	public void run() {
		Thread h = Thread.currentThread();
		for (int i=0; i<number; i+=1) {
			System.out.println(h.getName() + " " + i + "!="+calculateFactorial(i));	
		}
		for (int i=0; i<number; i+=1) {
			System.out.println(h.getName() + " " + i + "!="+calculateFactorial(i));	
		}
		
		System.out.println(h.getName() + " is STOP!");

	}
	
	
}
