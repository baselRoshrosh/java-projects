/**
 * 
 */

/**
 * @author Basel Roshrosh
 *
 */
public class GGT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int m;
		int n;
		m = a;
		n = b;
		int r = m - n;
		
		if (a <= 0 || b <= 0 ) {
			System.out.println("nur positive ganze Zahlen als Argumente erlaubt!");
			System.exit(-1);	
		}
		

		while (r != 0) {
				
			
			if (n > m){
		         int temp1 = m;
		         m = n;
		         n = temp1; 
		         }
			r = m - n;
	        m = n;
	        n = r;
	    }
	    System.out.println("ggT (" + a + "," + b + ") = " +  m );
	}
	  }

