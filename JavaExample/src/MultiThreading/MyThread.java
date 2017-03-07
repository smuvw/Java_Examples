package MultiThreading;

public class MyThread  extends Thread{
	
	//if no run method the by default Thread class Run will execute 
	
	
	public void run(){
		
		for (int i=1;i<=10;i++){
			System.out.println("Child Thread");
		}
	}
	
	
	// if we override start method it wont create new thread and wont call Thread class "start" method
	
/*public void start(){
		
		
			System.out.println("start method from MyThread class");
		
	}*/

}
