package Exception;

public class InvalidAgeException extends Exception{
	private String massage;

	public InvalidAgeException(String string) {
		super(string);
		this.massage = string;
	}

	public String getMassage() 
	{
		return massage;
	}
}
