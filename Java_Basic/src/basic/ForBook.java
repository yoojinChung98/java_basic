package basic;

public class ForBook {
	public static void main(String[] arg) {
		
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<10000000; i++) {
			System.out.printf(i+"안녕하세요\n");
		}
		
		
		long end = System.currentTimeMillis();
		System.out.println((end-start)*0.001);
		
	}
}
//12.504 ln 12.975
//12.800 print 13.25
//12.503 f 22.85