package ExceptionRuntime;

public class InvalidAgeException extends RuntimeException{
	private String Massage;

	public InvalidAgeException(String massage) {
		super(massage);
		Massage = massage;
	}
	public String getMassage() {
		return Massage;
	}
}
