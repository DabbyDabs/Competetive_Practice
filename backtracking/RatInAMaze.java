package backtracking;

public class RatInAMaze {

	public static void main(String[] args) {
		int[][] maze = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		PrintRatPaths(maze, 0, 0,maze.length);
	}

	public static void PrintRatPaths(int[][] maze, int row, int column,int n) {
if(row==n-1 && column==n-1) {
for(int i=0;i<maze.length;i++) {
	for(int j=0;j<maze[0].length;j++) {
		if(maze[i][j]==8)
			{System.out.print(1+" ");
			continue;}
		if(i==n-1 && j==n-1)
			{System.out.print(1+" ");
		continue;	}
		System.out.print(0+" ");
	}
	System.out.println();
}
	System.out.println();
}

		if(row>0 && maze[row-1][column]!=0 && maze[row-1][column]!=8) {
			int[][] duplicate = new int[n][n];
			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze[0].length; j++) {
					duplicate[i][j] = maze[i][j];
				}
			}
	duplicate[row][column]=8;
	PrintRatPaths(duplicate,row-1,column,n);
	}
if(row<n-1 && maze[row+1][column]!=0 && maze[row+1][column]!=8) {
	int[][] duplicate = new int[n][n];
	for (int i = 0; i < maze.length; i++) {
		for (int j = 0; j < maze[0].length; j++) {
			duplicate[i][j] = maze[i][j];
		}
	}
	duplicate[row][column]=8;
	PrintRatPaths(duplicate,row+1,column,n);
}
if(column>0 && maze[row][column-1]!=0 && maze[row][column-1]!=8) {
	int[][] duplicate = new int[n][n];
	for (int i = 0; i < maze.length; i++) {
		for (int j = 0; j < maze[0].length; j++) {
			duplicate[i][j] = maze[i][j];
		}
	}
	duplicate[row][column]=8;
	PrintRatPaths(duplicate,row,column-1,n);
}
if(column<n-1 && maze[row][column+1]!=0 && maze[row][column+1]!=8) {
	int[][] duplicate = new int[n][n];
	for (int i = 0; i < maze.length; i++) {
		for (int j = 0; j < maze[0].length; j++) {
			duplicate[i][j] = maze[i][j];
		}
	}
	duplicate[row][column]=8;
	PrintRatPaths(duplicate,row,column+1,n);
	return;	
}

		
	}

	public static void Print2DArray(int[][] darr) {
		for (int i = 0; i < darr.length; i++) {
			for (int j = 0; j < darr[0].length; j++) {
				System.out.print(darr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
