import java.lang.*;

class Threading extends Thread
{
	public static void main(String args[])
	{
		Threading T = new Threading();

		String name = Threading.currentThread().getName();
		Integer count = Threading.activeCount();
		Integer priority = T.getPriority();
		ThreadGroup group = T.getThreadGroup();

		System.out.println("Name = "+name);
		System.out.println("Count = "+count);
		System.out.println("Priority = "+priority);
		System.out.println("Group = "+group);
		System.out.println("Alive = "+T.isAlive());
		System.out.println("Daemon = "+T.isDaemon());
		System.out.println("Interrupted = "+T.isInterrupted());
	}
}
