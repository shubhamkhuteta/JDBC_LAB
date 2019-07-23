package lab11;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
public class Ex2
{
	public static void main(String[] args)
	{
		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(new Runnable() {
			@Override
			public void run()
			{
				long start_time = System.currentTimeMillis();
				while (true)
				{
					long current_time = System.currentTimeMillis() - start_time;
					long sec=((current_time/1000)%60);
					long min=((current_time/1000)/60);
					System.out.println(min+ "minutes"+sec+ "seconds");
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException ex)
					{
						System.out.println("Timer interrupted");
					}
				}
			}
		});
	}
}