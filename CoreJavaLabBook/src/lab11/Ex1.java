package lab11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Thread.sleep;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
public class Ex1
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the Source File Path -->");
			File source_file = new File(br.readLine());
			System.out.println("Enter the Target File Path -->");
			File target_file = new File(br.readLine());
			Executor exe = Executors.newSingleThreadExecutor();
			FileReader reader = new FileReader(source_file);
			FileWriter writer = new FileWriter(target_file);
			exe.execute(new Runnable()
			{
				@Override
				public void run()
				{
					int element;
					int count = 0;
					try
					{
						while ((element=reader.read())!=-1)
						{
							writer.write(element);
							count++;
							if(count==10)
							{
								count=0;
								System.out.println("No.of Characters Copied:10");
								sleep(10000);
							}
						}
						System.out.println("File Copied Successfully");
					}
					catch (IOException | InterruptedException ex)
					{
						System.out.println("Error in reading and writing file");
					}
					finally
					{
						try
						{
							reader.close();
							writer.close();
						}
						catch (IOException ex)
						{
							System.out.println("Error in Reading and Writing File");
						}
						catch (NullPointerException e)
						{
							System.out.println("One of the given File doesn't exist.");
						}
					}
				}
			}
					);
		}
		catch (IOException e)
		{
			System.out.println("The given input is Wrong");
		}
	}
}