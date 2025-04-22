
class Bigs {
			
	 public static int[ ] add (int[ ] a, int[ ] b) {
		 int newarr[] = new int[(int) Math.max(a.length, b.length)+1];
		 System.arraycopy(a, 0, newarr, 0, a.length);
		 
		 for (int i = 0; i < b.length; i++) {
			 newarr[i] = newarr[i] + b[i];
			if (newarr[i] / 10 == 1) {
				newarr[i] = newarr[i] % 10;
				newarr[i+1] += 1;
			}  
		}
		 
		 
		 if (newarr[newarr.length - 1] == 0) {
	            int[] newarrcut = new int[newarr.length - 1];
	            System.arraycopy(newarr, 0, newarrcut, 0, newarr.length - 1);
	            return newarrcut;
	        }
	        return newarr;
		 
			
		 } 

			
			 static void print (int[ ] n) { 
				 int mal = 0;
				 for (int i = n.length-1; i >= 0; i--) {
					 System.out.print(n[i]);
					 mal++;
					 if (mal == 68) {
						 System.out.println("\\");
						 mal = 0;
					 }
				 }
				 
				 
			 }
			
			 static int[ ] digit(int d) { 
				 int n[] = {d};
				 return n;
				 
			 }

			
			 static int[ ] Null() { 
				 return digit(0);
			 }

			
			 static int[ ] One() { 
				 return digit(1);
			 }
			

			
			 static int mod10(int[ ] n) {
				 int a[] = new int[n.length];
				 System.arraycopy(n, 0, a, 0, n.length);
				 for (int i = 0; i < a.length - 1; i++)
					 if (a[i] % 10 != 0) {
						 a[i] = (a[i] % 10);
					 }
				 return a[0];
			 }

			
			 static int[ ] div10(int[ ] n) { 
				 return n;
			 }

			 static int[ ] fromInt(int n) { 
				  int[] a = new int[(int) Math.log10(n) + 1];
			        for (int i = 0; i < a.length; i++) {
			            a[i] = n % 10;
			            n /= 10;
			        }
			        return a;
			 }

			
			 static int[ ] copy(int[ ] n) { 
			 		return n.clone();
			 }

			
			 static int[ ] times(int[ ] n, int d) { 
				 int[] g = new int[n.length + 1];
			        for (int i = 0; i < n.length; i++) {
			            int l = n[i] * d;
			            g[i] += l % 10;
			            g[i + 1] += l / 10;
			        }
			        if (g[g.length - 1] == 0) {
			            int[] gcut = new int[g.length - 1];
			            System.arraycopy(g, 0, gcut, 0, g.length - 1);
			            return gcut;
			        }
			        return g;
			 }

			
			 static int[ ] times10(int[ ] n) { 
				 int[] a = new int[n.length + 1];  a[0] = 0;
			        
			        System.arraycopy(n, 0, a, 1, n.length); 
			        return a;
				 
			 }

			
			 static int[ ] times(int[ ] a, int[ ] b) { 
				 int[] newarr = Null();

			        for (int i = 0; i < b.length; i++) {
			            int[] temparr = times(a, b[i]);
			            int[] temparr2 = new int[temparr.length + i]; 

			            System.arraycopy(temparr, 0, temparr2, i, temparr.length);
			            newarr = add(newarr, temparr2);
			        }

			        return newarr;
			    }
				

			
			 static int[ ] square(int[ ] a) { 
				 return times(a , a);
			 }

			
			 static int[ ] cubic(int[ ] a) { 
				 return times(square(a), a);
			 }

			
			 static boolean less (int[ ] a, int[ ] b) { 
				
				 if (a.length < b.length)
					 return true;
				 else if (a.length == b.length) {
				 for (int i = a.length - 1; i >= 0; i--) {
					 if (a[i] < b[i])
						 return true;
				 }
				 }
				 return false;
			 }

			
			 static boolean equal (int[ ] a, int[ ] b) { 
				 if (a.length != b.length) {
			            return false;}
				 
				 for (int i = 0; i < a.length; i++) { 
			            if (a[i] != b[i])
			                return false;
			        }
				 return true;
			 }

			 
			 static boolean ok (int[ ] n) { 
				 for (int i = 0; i < n.length; i++) {
					 if (n[i] > 9 || n[i] < 0) {
						 return false;
					 }
					 
				 }
				 return true;
			 }

			
			 static void maxDigit(int[] n) { 
				 int count = 1, tempCount;
				  int popular = n[0];
				  int temp = 0;
				  for (int i = 0; i < (n.length - 1); i++)
				  {
				    temp = n[i];
				    tempCount = 0;
				    for (int j = 1; j < n.length; j++)
				    {
				      if (temp == n[j])
				        tempCount++;
				    }
				    if (tempCount > count)
				    {
				      popular = temp;
				      count = tempCount;
				    }
				  }
				  System.out.println(popular);
			 }

			 public static void main (String[] s) {
				
			 int[ ] a = One();
			 for (int i=0; i<33222; ++i) { a = times(a, 2); }
			 System.out.println("2^33222 hat " + a.length + " Stellen");
			 print(a);
			 System.out.println();
			 int[ ] b = fromInt(13);
			 int[ ] c = copy(b);
			 for (int i=1; i< 8978; ++i) { c = times(c, b); }
			 System.out.println("13^8978 hat " + c.length + " Stellen");
			 print(c);
			 System.out.println();
			 System.out.println(less(a, c)); 
			 maxDigit(a);
			 maxDigit(c);
			
			 }
			}
