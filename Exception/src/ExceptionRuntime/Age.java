package ExceptionRuntime;

public class Age {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) 
	{
		if(age<18)
		{
			throw new InvalidAgeException("Mày không đủ tuổi");
		}
		else
			this.age = age;
	}
	public Age(int age) {
		setAge(age);
	}
	
}
