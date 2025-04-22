
public class Gray {
	
	public static int count=0;	
	public static int [] toBinary(int ng) {//converts the n to an binary number but in array
		int Arr[]= new int[31];
		int Rest;
		
		for(int i=0 ; i<Arr.length ; i++) {
			Rest = ng%2;
			Arr[i] = Rest;
			ng = ng/2;			
			
			if(ng==0)
				break;		
			count++;
		}		
		return Arr;				
	}
		
	 public static int toGray(int n) {
		 
		 int Arr[]=toBinary(n);
		 int Arr2[]=new int[31];
		 int x=0;
		 		 
		 for(int i=count ; i>=0 ; i--) {//make the xor operation(convert from binary to gray code)
						
			if(i==count) { 
				Arr2[i]=Arr[i];
			continue;
			}
			
			if(Arr[i]+Arr[i+1]==1)
				Arr2[i]=1;	
		 }
		 
		 for(int i=count ; i>=0 ; i--) {//convert from binary(but in gray code) to int
			 
			 if(i==count) { 
					x=Arr2[i];
				continue;
				}			 
			 x=x*2 + Arr2[i];			 	
		 }	
		 count=0;
		 return x;
		 
	 }
	 
	 public static int fromGray(int g) {
		 
		 int Arr[]=toBinary(g);//here it's to binary but we count it as gray code 
		 int Arr2[]=new int[31];
		 int x=0;
	 
		 for(int i=count ; i>=0 ; i--) {//make the xor operation(convert from binary to gray code)
						
			if(i==count) { 
				Arr2[i]=Arr[i];
			continue;
			}
			
			if(Arr2[i+1]+Arr[i]==1)
				Arr2[i]=1;	
		 }
		 
		 for(int i=count ; i>=0 ; i--) {//convert from gray code to int
			 
			 if(i==count) { 
					x=Arr2[i];
				continue;
				}			 
			 x=x*2 + Arr2[i];			 	
		 }
		 
		 count=0;
		 return x;		 
	 }
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int g =Integer.parseInt(args[1]);
		System.out.println(toGray(n));
		System.out.println(fromGray(g));
	}

}
