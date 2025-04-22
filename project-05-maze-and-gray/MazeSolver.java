import gdp.stdlib.StdDraw;

public class MazeSolver {

	public static void main(String[] args) {

		int[][] maze = {
				{ 0, 0, 1, 1, 1, 1, 1, 2 },
				{ 0, 0, 1, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 1, 1, 0 },
				{ 1, 1, 1, 1, 1, 1, 0, 0 },
				{ 1, 0, 1, 0, 1, 1, 0, 0 },
				{ 0, 0, 1, 0, 0, 1, 0, 0 },
				{ 3, 1, 1, 0, 0, 0, 0, 0 }
			};

		StdDraw.setXscale(0, maze.length - 1);
		StdDraw.setYscale(maze.length - 1, 0);

		solve(maze, 0, maze.length - 1);

	}

	static void draw(int[][] maze) {
		

		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				
				if (maze[i][j] == 0) {
					StdDraw.setPenColor(StdDraw.GRAY);
					StdDraw.filledSquare(j, i, 0.5);
				} 
					else if (maze[i][j] == 1 || maze[i][j] == 4) {
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.filledSquare(j, i, 0.5);

				}
					else if (maze[i][j] == 2) {
					StdDraw.setPenColor(StdDraw.GREEN);
					StdDraw.filledSquare(j, i, 0.5);
				}	
					else if (maze[i][j] == 3) {
					StdDraw.setPenColor(StdDraw.BLUE);
					StdDraw.filledSquare(j, i, 0.5);

				}	else if (maze[i][j] == 5) {
					StdDraw.setPenColor(StdDraw.RED);
					StdDraw.filledSquare(j, i, 0.5);
				}
					        
			}
			
		}
		for (int y=0 ;y < maze.length ; y++) {    //we painted the lines in the display part 1
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.line(0-0.5,y-0.5,7+0.5,y-0.5);
        }
        for (int x=0 ; x < maze.length ; x++) {    //we painted the lines in the display part 2
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.line(x-0.5,0.0-0.5,x-0.5,7+0.5);
        }

		StdDraw.show(500);

	}

	static boolean solve(int[][] maze, int row, int col) {

		if (col < 0)
			return false;
		if (row > maze.length - 1)
			return false;
		if (maze[row][col] == 0)
			return false;
		if (maze[row][col] == 3)
			return true;


		maze[row][col] = 2;
		draw(maze);

		boolean result = solve(maze, row, col - 1); // Try move to the left
		if (result == true)
			return true;


		boolean result2 = solve(maze, row + 1, col); // Try move down
		if (result2 == true)
			return true;


		maze[row][col] = 1;
		return false;

	}

	

	

}

