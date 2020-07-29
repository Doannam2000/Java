package bai9;

public class ToanTu {
     public static void ThucHien(float a,float b,float c) {
    	 float max;
    	 max=a;	
    		max=(a>b) ? a : b;
    		max=(a>c) ? a : c;
    		System.out.print("gia tri lon hon la:"+max);
    	 
     }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		float a=7,b=9,c=20;
       ThucHien(a,b,c);
         
	}

}
