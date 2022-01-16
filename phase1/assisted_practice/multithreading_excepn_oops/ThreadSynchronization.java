package phase1.assisted_practice.multithreading_excepn_oops;

class Line
{
	synchronized public void getLine()                     
	{
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try
			{
				Thread.sleep(500);   //0.4 secs
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());    
			System.out.println("running thread name is:"+Thread.currentThread().getName()); 
			System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive()); 
		    System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId());
		}
	}
}

class Train extends Thread
{
	Line line;

	Train(Line line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.getLine();
	}
}

public class ThreadSynchronization
{
	public static void main(String[] args)
	{
		Line obj = new Line();

		Train train1 = new Train(obj);
		Train train2 = new Train(obj);
		Train train3 = new Train(obj);
		train1.setName("IT");
		train2.setName("Finance");
		train3.setName("HR");

		train1.start();
		train2.start();
		train3.start();
	}
}

