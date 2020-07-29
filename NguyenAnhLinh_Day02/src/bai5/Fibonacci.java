package bai5;

public class Fibonacci {

	private static int fibonacci(int k) {
		if(k<0) {
			return -1;
		}else if((k==0)||(k==1)) {
			return k;
		}else {
			return fibonacci(k - 1) + fibonacci(k - 2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("15 số đầu tiên trong dãy Fibonacci:");
		for(int i=1; i<15; i++) {
			System.out.print((fibonacci(i))+"\t");
		}
	}

}
