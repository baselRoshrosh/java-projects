
public class Vollmond {
	
		public static void main(String[] args) {
			int n = Integer.parseInt(args[0]);
			String[] Monate = { "" , "Januar", "Februar" , "Maerz" , "April" , "Mai" , "Juni" , "Juli"
					                         , "August" , "September" , "Oktober" , "November" , "Dezember"};
			int r;
			int max;
			int jahr = 2022;
			int s = 0;
		
			for (int tag = 1 ; s < n  ; tag += 29 ) {
				
				if ((jahr % 4 == 0 && jahr % 100 != 0 ) || ( jahr % 4 == 0 && jahr % 100 == 0 && jahr % 400 == 0 )) {
					max = 366;
					if (tag > max) {
						 r = tag - max;
						 tag = r;
						 jahr++;
					}
					
				 switch (tag) { 
				  case 1:
				    System.out.println(jahr + "," + " " + Monate [1]);
				    break;
				  case 2:
				    System.out.println(jahr + "," + " " + Monate [1]);
				    break;
				  case 61:
				    System.out.println(jahr + "," + " " + Monate [3]);
				    break;
				  case 62:
				    System.out.println(jahr + "," + " " + Monate [3]);
				    break;
				  case 92:
				    System.out.println(jahr + "," + " " + Monate [4]);
				    break;
				  case 122:
				    System.out.println(jahr + "," + " " + Monate [5]);
				    break;
				  case 123:
				    System.out.println(jahr + "," + " " + Monate [5]);
				    break;
				  case 153:
					System.out.println(jahr + "," + " " + Monate [6]);
					    break;
				  case 183:
					System.out.println(jahr + "," + " " + Monate [7]);
					    break;
				  case 184:
					System.out.println(jahr + "," + " " + Monate [7]);
					    break;
				  case 214:
					System.out.println(jahr + "," + " " + Monate [8]);
					    break;
				  case 215:
					System.out.println(jahr + "," + " " + Monate [8]);
					    break;
				  case 245:
					System.out.println(jahr + "," + " " + Monate [9]);
					    break;
				  case 275:
					System.out.println(jahr + "," + " " + Monate [10]);
					    break;
				  case 276:
					System.out.println(jahr + "," + " " + Monate [10]);
					    break;
				  case 306:
					System.out.println(jahr + "," + " " + Monate [11]);
					    break;
				  case 336:
					System.out.println(jahr + "," + " " + Monate [12]);
					    break;
				  case 337:
					System.out.println(jahr + "," + " " + Monate [12]);
					    break;
			      } 
				 if (tag == 1 || tag == 2|| tag == 61|| tag == 62|| tag == 92|| tag == 122||
						 tag == 123|| tag == 153|| tag == 183|| tag == 184|| tag == 214|| tag == 215||
						 tag == 245|| tag == 275|| tag == 276|| tag == 306|| tag == 336|| tag == 337) {
					 s++;
				 }
				} 
				else {
					max = 365;
					if (tag > max) {
						 r = tag - max;
						 tag = r;
						 jahr++;
					}
				 switch (tag) { 
				  case 1:
				    System.out.println(jahr + "," + " " + Monate [1]);
				    break;
				  case 2:
				    System.out.println(jahr + "," + " " + Monate [1]);
				    break;
				  case 60:
				    System.out.println(jahr + "," + " " + Monate [3]);
				    break;
				  case 61:
				    System.out.println(jahr + "," + " " + Monate [3]);
				    break;
				  case 91:
				    System.out.println(jahr + "," + " " + Monate [4]);
				    break;
				  case 121:
				    System.out.println(jahr + "," + " " + Monate [5]);
				    break;
				  case 122:
				    System.out.println(jahr + "," + " " + Monate [5]);
				    break;
				  case 152:
					System.out.println(jahr + "," + " " + Monate [6]);
					    break;
				  case 182:
					System.out.println(jahr + "," + " " + Monate [7]);
					    break;
				  case 183:
					System.out.println(jahr + "," + " " + Monate [7]);
					    break;
				  case 213:
					System.out.println(jahr + "," + " " + Monate [8]);
					    break;
				  case 214:
					System.out.println(jahr + "," + " " + Monate [8]);
					    break;
				  case 244:
					System.out.println(jahr + "," + " " + Monate [9]);
					    break;
				  case 274:
					System.out.println(jahr + "," + " " + Monate [10]);
					    break;
				  case 275:
					System.out.println(jahr + "," + " " + Monate [10]);
					    break;
				  case 305:
					System.out.println(jahr + "," + " " + Monate [11]);
					    break;
				  case 335:
					System.out.println(jahr + "," + " " + Monate [12]);
					    break;
				  case 336:
					System.out.println(jahr + "," + " " + Monate [12]);
					    break;
			} 	
				 if (tag == 1 || tag == 2|| tag == 60|| tag == 61|| tag == 91|| tag == 121||
						 tag == 122|| tag == 152|| tag == 182|| tag == 183|| tag == 213|| tag == 214||
						 tag == 244|| tag == 274|| tag == 275|| tag == 305|| tag == 335|| tag == 336) {
					 s++;
				}
				
	    }
			
	  }	
    }
  }




