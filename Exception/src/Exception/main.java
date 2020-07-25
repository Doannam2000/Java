package Exception;

public class main {

	public static void main(String[] args) {
		Tuoi tuoi;
		try {
			tuoi = new Tuoi(15);
			System.out.println(tuoi.getAge());
		} catch (InvalidAgeException e) {
		
			e.printStackTrace();
		}
	}
}
