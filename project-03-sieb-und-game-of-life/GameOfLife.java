import gdp.stdlib.StdIn;
import gdp.stdlib.StdOut;
import gdp.stdlib.StdDraw;


public class GameOfLife {

	public static void main(String[] args) {
		
		
		int [][] xy = readAlive();
		double r=0.5;  //el r tab3 lradius el morab3 3shan ersmo s7
		int X = xy.length;
		int Y = xy [0].length;
		StdDraw.setXscale(0.0 , X);
		StdDraw.setYscale(0.0 , Y);
		
		
		
		
		
		while (true) {
			drawMap(X,Y,xy,r);
			xy = nextStep(xy,X,Y); 
		}
		         	
	}
	
	
	public static void drawMap(int X , int Y , int [][] xy , double r) {
		StdDraw.clear();
		for (int y=0 ;y <= Y ; y++) {	//we painted the lines in the display part 1
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.line(0,y,X,y);
		}		
		for (int x=0 ; x<= X ; x++) {    //we painted the lines in the display part 2
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.line(x,0,x,Y);			
		}
		
    	for (int y=0 ; y < Y ; y++) {
		    
			for (int x =0 ; x < X ; x++) {
				if (xy [x][y] == 1) {
					StdDraw.setPenColor(StdDraw.GREEN);  				
					StdDraw.filledSquare(x+0.5 , y+0.5 , r);
				}				
			}
    	}
    	StdDraw.show(200);
	}
	
	public static int nachbarn(int [][] xy , int currentX , int currentY , int X , int Y ) {
		int anzahlLebendeNachbarn=0;
		for(int Xdifference = -1 ; Xdifference <= 1 ; Xdifference++) {
			for (int Ydifference = -1 ; Ydifference <= 1 ; Ydifference++ ) {
				int nachbarX= currentX + Xdifference;
				int nachbarY= currentY + Ydifference;	
				
				if(nachbarX<0)
					nachbarX=X-1;
				if(nachbarY<0)
					nachbarY=Y-1;
				if(nachbarX>X-1)
					nachbarX=0;
				if(nachbarY>Y-1)
					nachbarY=0;
				
				if(xy[nachbarX][nachbarY]==1) {
					anzahlLebendeNachbarn++;				
				}
			}
		}
		if(xy [currentX][currentY]== 1)
			return anzahlLebendeNachbarn-1;
		
		return anzahlLebendeNachbarn;
	}
	
	public static int [][] nextStep(int [][] xy , int X , int Y  ){
		int [][] newxy = new int [X][Y];
		
		for(int y = 0 ; y < Y ; y++) {
			for(int x = 0 ; x < X ; x++) {
				int anzahlLebendeNachbarn = nachbarn(xy , x , y , X , Y );
				if (xy[x][y]==0 && anzahlLebendeNachbarn==3 )
					newxy[x][y]=1;
				else if (xy[x][y]==1 && (anzahlLebendeNachbarn==2 || anzahlLebendeNachbarn==3))
					newxy[x][y]=1;
				else
				newxy[x][y]=0;
			}
		}	
		return newxy;	
	}
	
	
	public static int [][] readAlive(){
		
		int X = StdIn.readInt();
		int Y = StdIn.readInt();
		int [][] xy = new int [X][Y];
		int numOfLivingCells = StdIn.readInt();
		for(int i = 0 ; i < numOfLivingCells ; i++ ) {
			int x = StdIn.readInt();
			int y = StdIn.readInt();
			xy [x][y] = 1;
		}
			
		return xy;
			
	}
	
        	
}


        
        
        
        
   