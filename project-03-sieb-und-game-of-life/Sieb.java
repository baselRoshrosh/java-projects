
public class Sieb {
	
	
		static int gross(int V) {//This method was supposed to be the original program, but then i was informed that we need to use the algorithem from the Lectures. 
		// In the end this program actually helped me solve the Aufgabe,
			
			// So this method just changes our N variable to a higher number in order to get N number of Prime Numbers instead of giving us prime Numbers from 2-N.
			int D = V; // V here is the int we pass into this method from the main class which in this case is our argument (our input N) 
			int num = 2; // First possible prime number
			int l = 0; //This variable is for the number of times the loop was initiated which will be the new N in the main class.
			
			
			
		for (int j = 1; j <=D;) { //I could have used a while loop and it would probably be better but im more comfortable with for loops in general
				
		    boolean check = false; // to check if a certain number is a prime or not
		    for (int i = 2; i <= num / 2; i++) {
		      if (num % i == 0) {
		        check = true;
		        break;
		      }
		    }

		    if (!check) {
		    	//System.out.println(num);
		    	
		      num++;
		      j++;
		      l++;
		    }
		    else   {
		    	
		      num++;
		      l++;
		      
		    }

		}
		
		
		return l; //This l now is our new N
		}
		
	public static void main(String[] args) { // i tried to keep the program exactly the same as it was written in the Lecture.
		
		int N = Integer.parseInt(args[0]);
		if (N == 1) {
			System.out.println(2);
			System.exit(0);
		}
		 N = gross(N) + 3; //I put plus 3 here because with out it the program always prints N-1 prime numbers.
		 boolean [] p = new boolean[N];
		
		for(int i = 2; i < N; i++) 
			p[i] = true;
		
		
		for (int i = 2; i * i < N; i++) {
			if (p[i]) {
				for (int j = 2; j * i < N; j++) {
					p [j*i] = false;
				}
			}
		
		}
		for (int i = 2; i < N; i++) {
			if (p[i]) {
				System.out.println(i);
			}
		}
	}

}