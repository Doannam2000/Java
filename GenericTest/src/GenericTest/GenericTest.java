package GenericTest;

public class GenericTest {
	public void Show(Object[] object)
	{
		try {
		for(Object x:object)
		{
			Thread.sleep(1000);
			System.out.println(x);
		}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String[]args)
	{
		Integer[] integers = {1,3,5,9,7};
		String[] strings = {"cái " , "gì"};
		GenericTest test = new GenericTest();
		test.Show(integers);
	}
}
