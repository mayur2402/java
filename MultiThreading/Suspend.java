import java.lang.*;
import java.util.*;

class SuspendThread extends Thread{
	public void run(){
		try{
			for(int i = 0;i < 5;i++){
				String name = Thread.currentThread().getName();
				if(name.equals("Thread-0"))
				{
					System.out.println(Thread.currentThread().getName());
					Thread.currentThread().sleep(2000);
				}
				else if(name.equals("Thread-1"))
				{
					System.out.println(Thread.currentThread().getId());
					Thread.currentThread().sleep(3000);
				}
				else
				{
					System.out.println(Thread.currentThread());
					Thread.currentThread().sleep(4000);
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

class Suspend{
	public static void main(String[] args) {
			SuspendThread t1 = new SuspendThread();
			SuspendThread t2 = new SuspendThread();
			SuspendThread t3 = new SuspendThread();
			
			System.out.println("Starting "+t1.getName());
			t1.start();
			System.out.println("Starting "+t2.getName());
			t2.start();
			
			System.out.println("Suspending "+t2.getName());
			t2.suspend();

			System.out.println("Starting "+t3.getName());
			t3.start();

			System.out.println("Resuming "+t2.getName());
			t2.resume();
	}
}