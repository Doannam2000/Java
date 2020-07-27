package Bai1;

public class Name {

	public static void CountTime() throws InterruptedException
	{
		for(int i = 0;i<10;i++)
		{
			Thread.sleep(1000);
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		CountTime();
	}

}
