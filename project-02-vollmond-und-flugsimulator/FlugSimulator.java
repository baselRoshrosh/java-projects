

public class FlugSimulator {

	
	public static void main(String[] args) {
		double n = Integer.parseInt(args[0]);// the amount of simulated flights
		double average = 0 , sum = 0;
		int f = 0; // Number of overbooked flights
		
		if (n < 1) {
			System.out.println("Du darfst nur Zahlen,die großer als 0 eingeben!!");
			System.exit(0);
		}
		
		for (int j=1 ; j<=n ; j++) {
			double k = 0;
			for (int i=1; i<=78 ; i++) {
				double c = Math.random();
				if (c >= 0.08) 
					k++;
			
								}
			
			
			
			if (k > 75) {
				f++;
			}
			sum += k;
		}
		average = sum/(n);
		double m = average;
		double roundedm = Math.round(m *10)/10.0;
		double d= (f/n)*100;
		double rounded = Math.round(d *100)/100.0;
		
		System.out.print("Überbuchungen: " +f+ "  "); System.out.print("("+rounded);
		System.out.println("%)");
		System.out.println("Mittelwert: " +roundedm);
		
 }}
