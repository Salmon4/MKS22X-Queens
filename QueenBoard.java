public class QueenBoard{
	private int[][]board;

	public QueenBoard(int size){
		int[][] board = new int[size][size];
		for (int r = 0; r < size; r++){
			for (int c = 0; c < size; c++){
				board[r][c] = 0; //0 is a blank spot
			}
		}
	}

	private boolean addQueen(int r, int c){
		if (board[r][c] == 0){		
			board[r][c] = -1; // -1 is a queen
			for (int i = 0; i < board.length; i++){
				board[i][c] = board[i][c] + 1;
			}
			for (int k = 0; k < board[r].length; k++){
				board[r][k] = board[r][k] + 1;
			}
			return true;
		}
		return false;
	}

	private boolean removeQueen(int r, int c){
		if (board[r][c] == -1){		
			board[r][c] = 0; 
			for (int i = 0; i < board.length; i++){
				board[i][c] = board[i][c] - 1;
			}
			for (int k = 0; k < board[r].length; k++){
				board[r][k] = board[r][k] - 1;
			}
			return true;
		}
		return false;
	}

	public String toString(){
		String ans = "";
		for (int r = 0; r < board.length; r++){
			for (int c = 0; c < board[r].length; c++){
				if (board[r][c] == -1){
					ans += "Q ";
				}
				else{
					ans += "_ ";
				}
			}
		}
		return ans;
	}

	public boolean solve(){
		return solveHelper(0,0);
	}

	private boolean solveHelper(int startR, int startC){ //goes row by row and col by col and check if its avaliable
		if (board[startR][startC] == 0){
			addQueen(startR,startC);
		}
		for (int r = startR; r < board.length; r++){
			for (int c = startC; c < board[r].length; c++){
				
			
	}

	public int countSolutions(){
	
	}

}
