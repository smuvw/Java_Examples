package MultiThreading;

public class ThreadDemo {

	public static void main(String[] args) {
//In JvM Thread Schedule will decide   - the Thread Execution order.
	//This is depend on JVM  and we can't except same results everytime.
		MyThread t= new MyThread();
		t.start();// new thread will create  for the execution of  run method
		//t.run(); //It wont create new Thread and run method will be execute like an method call by main Thread
		for (int i=1;i<=10;i++){
			System.out.println("Main Thread");
				
		}

	}

}
