package Problems;

import java.awt.print.Printable;

public class SudokoSolver {
	private static final int Grid_Size=9;
	//grid size can be only 9*9 and its not changed so we are using final to fix the size of grid

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = {
				{1, 2,0, 4, 0,0 , 3, 0, 0},
				
				{3, 0,0, 0, 1,0 , 0, 5, 0},
				
				{0, 0,6, 0, 0,0 , 1, 0, 0},
				
				{7, 0,0, 0, 9,0 , 0, 0, 0},
				
				{0, 4,0, 6, 0,3 , 0, 0, 0},
				
				{0, 0,3, 0, 0,2 , 0, 0, 0},
				
				{5, 0,0, 0, 8,0 , 7, 0, 0},
				
				{0, 0,7, 0, 0,0 , 0, 0, 5},		
				
				{0, 0,0, 0, 0,0 , 0, 9, 8}
				
//				{7, 0, 2, 0, 5, 0, 6, 0, 0},
//				
//				{0, 0,0, 0, 0 , 3 , 0, 0, 0},
//				
//				{1, 0,0, 0, 0,9 , 5, 0, 0},
//				
//				{8, 0,0, 0, 0,0 , 0, 9, 0},
//				
//				{0, 4,3, 0, 0,0 ,7, 5, 0},
//				
//				{0, 9,0, 0, 0,0 , 0, 0,8},
//				
//				{0, 0,9, 7, 0,0 , 0, 0, 5},
//				
//				{0, 0,0, 2, 0,0 , 0, 0, 0},		
//				
//				{0, 0,7, 0, 4,0 , 2, 0, 3}
//				
				
		};
		if(solveBoard(board)) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
		
		
	 printBoard(board);
	}
	 
	  private static void printBoard(int[][] board) {
	    for (int row = 0; row < Grid_Size; row++) {
	      if (row % 3 == 0 && row != 0) {
	        System.out.println("-----------");
	      }
	      for (int column = 0; column < Grid_Size; column++) {
	        if (column % 3 == 0 && column != 0) {
	          System.out.print("|");
	        }
	        System.out.print(board[row][column]);
	      }
	      System.out.println();
	    }}
	  
	
	
	
	
	//if a number already exist in a row
    public static boolean isNumberInRow(int[][] board,int number,int row) {
    	for(int i=0;i<Grid_Size;i++) {
    		if(board[row][i]==number)
    			//the board that was passed in and the current column i we are iterating throught  = the number
    			{
    			//System.out.println(number);
    			return true;
    			
    		}
    	}
		return false;
    	
    }
    
  //if a number already exist in a column
    public static boolean isNumbreInColumn(int[][] board,int number,int column) {
    	for(int i= 0;i<Grid_Size;i++) {
    		if(board[i][column]==number)
    		//if column is 0==>board[0][0],board[1][0].........
    		{
    			//System.out.println(number);
    			 return true;
    		}
    	}
    	 return false;
    	
    }
    //if a number already exist in a sub-grid
    //to check the grid to check wether the number exist or not we can do that by geting top left corner of the grid
    public static boolean isNumberInGrid(int[][] board, int number, int row,int column) {
    	
    	int lBR=row-row%3;//if row =1==>1-(1%3)->1-1==>0
    	int lBC=column-column%3;//if column=4=> 4-(4%3)->4-1=>3
    	
    	for(int i=lBR; i<lBR+3; i++) {
    		for(int j=lBC; j<lBC+3; j++) {
    			if(board[i][j]==number) {
    				return true;
    			}
    			
    			
    		}
    	}
    	
		return false;
    	
    }
    
    
    
    
    //checking the above 3 methods
    private static boolean isPlacementValid(int[][]board,int number,int row,int column) {
    	
		return !isNumberInRow(board, number, row)&&
				!isNumbreInColumn(board, number, column)
				&& !isNumberInGrid(board, number, row, column);
    	
    }
    
    
    
    private static boolean solveBoard(int [][] board) {
    	for(int row=0;row<Grid_Size;row++) {
    		for(int column=0;column<Grid_Size;column++) {
    			if(board[row][column]==0) {
    				for(int nubtry=1;nubtry<=Grid_Size;nubtry++) {
    					if(isPlacementValid(board, nubtry, row, column)) {
    						board[row][column]=nubtry;
    						
    						
    						
    						if(solveBoard(board)) {
    							return true;
    						}
    						else {
    							board[row][column]=0;//will set back the placement
    						}
    					}
    				}
    				return false;//cannot solve the board
    			}
    		}
    	}
		return true;
    	
		
	}
	

}



