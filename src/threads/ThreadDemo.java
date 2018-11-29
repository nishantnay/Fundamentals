package threads;

public class ThreadDemo {

	private int []numbers= new int[]{7,8,2,9};
	
	public int getMaxNumber(){
		int max_number=numbers[0];
		for(int i=1; i<numbers.length; i++){
			max_number= max_number>numbers[i]?max_number: numbers[i]; 
		}
		//System.out.println();
		return max_number;
	}
	public static void main(String[] Args) throws InterruptedException{

		
		Thread t1= new Thread(()-> {
			// find the max number in the given array.
							
				ThreadDemo demo1= new ThreadDemo();
				//Thread.sleep(1000);
				Thread.yield();// JVM has every right to honor/ dishonor yield request. 
				System.out.println("From thread: "+Thread.currentThread().getName()+" Max number is "+demo1.getMaxNumber());
			

		});

		Thread t2= new Thread(()-> {
			ThreadDemo demo1= new ThreadDemo();
			System.out.println("From thread: "+Thread.currentThread().getName()+" Max number is "+demo1.getMaxNumber());

		});

		t1.setName("Thread 1");
		t2.setName("Thread 2");


		t1.start();
		t2.start();
	}


}

