import  java.lang.Math;
public class ArmstrongNumbers {

	public static void main(String[] args) { //The main Method will only be used to print the numbers

		int n = Integer.parseInt(args[0]);
		
		int prntarr[]= giveArmstrongNumbers(n);  	 // this Variable will be used to copy the retuned array with the Armstrong Numbers
		
		for (int i = 0; i < prntarr.length; i++) {
			if (i + 1 == prntarr.length) { // this if Statement for the last number in the array
				System.out.println(prntarr[i]);
				break;
			}
			System.out.print(prntarr[i]+ ", ");
		}
	
	}
	
 static int[] giveArmstrongNumbers(int N) {  // this method puts the Armstrong Numbers in an Array
		
		int armnum[] = new int[N];
		int numbers = 0;
		
		for (int i = 0; numbers < N; i++) {

			if(isArmstrongNumber(i)) {
				armnum[numbers] = i;
				numbers++;
			}
		}
		return armnum;
		}

	static boolean isArmstrongNumber(int index) { // this Method checks if a specific number is an Armstrong Number
		
		if (index == 0) {
			return true;
		}
		
		int indexcopy = index;
		int inarr[] = new int[(int) (Math.log10(index) + 1)];
		int arrsum = 0;
		
		for (int i = 0; i < inarr.length; i++) {
			inarr[i] = indexcopy % 10;
			indexcopy /= 10;
					
		}
		
		for (int i = 0; i < inarr.length; i++) {	
			inarr[i] = (int) Math.pow(inarr[i], inarr.length);
		}
			
		for (int i = 0; i < inarr.length; i++) {
			arrsum = arrsum + inarr[i];
		}
		
		if (arrsum == index) {
			return true;
		}
		return false;
	}
}
