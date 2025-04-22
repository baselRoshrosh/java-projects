
public class Nolindrom {

	
	public static void main(String[] args) {
		 if(args.length == 0) {
		 System.out.println("Bitte geben Sie die Obergrenze als Parameter an.");
	        System.exit(0);
	    }
		 long n = Integer.parseInt(args[0]);
		 if(n > 100000) {
			 System.out.println("Bitte geben Sie die Obergrenze als Parameter an.");
		        System.exit(0);
		    }
		else  {
        long f = n;  
		for (long g = 0 ; g <= f ; g++ ) {
	    long N=g;
	    long R=0;
	    long Rsumme=0;
	    long number1;
	    long number2;
	    long rest1;
	    long rest2;
	    long Summe;
	    long k = 0;
	    
	    
		while (true) {
			if (k >= 100) {
				
				System.out.println(g);
				break;
			}
		number1 = N;
		while(number1 != 0) {
			rest1 = number1 % 10;
			R = R * 10 + rest1;
			number1 = number1 / 10;
		}
		if (R > Long.MAX_VALUE - N) {
			
			System.out.println(g);
			break;
		}
		// m3na N and Rn
		Summe = N + R;
		number2 = Summe;
		while (number2 != 0) {
			rest2 = number2 % 10;
			Rsumme = Rsumme * 10 + rest2;
			number2 = number2 / 10;
		}
		// m3na summe and Rsumme
		 if (Summe != Rsumme) {
			N = Summe;
			R=0;
			Rsumme=0;
			k++;
		} 
		else {
			break;
		}
		}
		}
	    }
	}
}

     
	

