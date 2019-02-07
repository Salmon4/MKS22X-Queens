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
		board[r][c] = -1; // -1 is a queen
	}

	private boolean removeQueen(int r, int c){
		board[r][c] = 0; 
	}

	public String toString(){
		String ans = "";
		for (int r = 0; r < board.length; r++){
			for (int c = 0; c < board[r].length; c++){
				if (board[r][c] == -1){
					ans += "Q";
				}
				else{
					ans += "_";
				}
			}
		}
		return ans;
	}

	public boolean solve(){
		
	}

	public int countSolutions(){
	
	}

}
