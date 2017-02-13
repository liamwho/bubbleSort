package ie.lyit.files;

public class Stopwatch 
{
	private long elapsedTime;
	private long startTime;
	private boolean isRunning;
	
	public Stopwatch()
	{
		reset();
	}
	
	public void start()
	{
		if(isRunning)
			return;
			isRunning = true;
			startTime = System.nanoTime();
	}
	
	public void stop()
	{
		if(!isRunning)
			return;
		isRunning = false;
		long endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
	}
	
	public double getElapsedTime()
	{
		if(isRunning)
		{
			long endTime = System.nanoTime();
			elapsedTime = (endTime - startTime);
			return elapsedTime;
		}
		else
			return elapsedTime;
	}
	
	public void reset()
	{
		elapsedTime = 0;
		isRunning = false;
	}
	
}
