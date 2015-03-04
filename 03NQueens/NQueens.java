public class NQueens{
	/*
	final static String clear =  "\033[2J";
	final static String hide =  "\033[?25l";
	final static String show =  "\033[?25h";
	
	private int[][]board;
	
	public String name(){
		return "li.david";
	}
	
	private String go(int x,int y){
		return ("\033[" + x + ";" + y + "H");
	}
	
	public void wait(int millis){
		try {
			Thread.sleep(millis);
		}
		catch (InterruptedException e) {
		}
	}
	*/

	int[][] board;

	public NQueens(int size){
		board = new int[size][size];
	}
	public String toString(){
		String s = "";
		for (int r = 0; r <  board.length; r++){
			for (int c = 0; c <  board.length; c++){
				s += board[r][c] + " ";
			}
			s += "\n";
		}
		return s;
	}
	public String  name(){
		return "li.david";
	}
	public boolean solve(){
		return solve(0);
	}
	public boolean solve(int x){
		return solve(x,0,1);
	}
	public boolean solve(int x, int y, int num){
		if (x >= board.length || y >= board.length || x < 0 || y < 0){
			return false;
		}
		if (board[x][y] != 0){
			return false;
		}
		for (int i = 0; i < board.length; i++){
			if (board[i][y] != 0 && i != x) return false;
			if (board[x][i] != 0 && i != y) return false;
			if (y + i < board.length && x + i < board.length){
				if (board[x+i][y+i] != 0) return false;
			}
			if (y + i < board.length && x - i >= 0){
				if (board[x-i][y+i] != 0) return false;
			}
			if (y - i  >= 0 && x + i < board.length){
				if (board[x+i][y-i] != 0) return false;
			}
			if (y - i >= 0 && x - i >= 0){
				if (board[x-i][y-i] != 0) return false;
			}
		}
		if (board[x][y] == 0){
			board[x][y] = num;
			for (int i = 0; i < board.length; i++){
				if (solve(i, y+1, num + 1)) return true;
			}
			board[x][y] = 0;
		}
		if (num == board.length){
			board[x][y] = num;
			return true;
		}
		return false;
	}
}