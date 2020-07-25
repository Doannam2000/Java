package Exception;

public class Tuoi {
	private int Age;

	public Tuoi(int i) throws InvalidAgeException {
		setAge(i);
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) throws InvalidAgeException {
		if(age<18)
		{
			throw new InvalidAgeException("Mày Không đủ tuổi");
		}
		else
		{
			this.Age = age;
		}
	}
}
