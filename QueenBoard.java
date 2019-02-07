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

	}

	public boolean solve(){
		
	}

	public int countSolutions(){
	
	}

}
