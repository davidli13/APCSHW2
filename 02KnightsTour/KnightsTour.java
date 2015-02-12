import java.util.*;
import java.io.*;

public class KnightsTour{
    //constants for the class
    //terminal specific character to clear screen , or hide/show cursor
    final static String clear =  "\033[2J";
    final static String hide =  "\033[?25l";
    final static String show =  "\033[?25h";

    //instance variable
    private int[][]board;


    //terminal specific character to move the cursor
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

    public String toString(){
	String ans = "\n";
	//build your knights tour here...
	for (int r = 0; r < board.length; r++){
	    for (int c = 0; c < board.length; c++){
		ans += ' ';
		ans += board[r][c];
		if (board[r][c] < 10){
		    ans += ' ';
		}
	    }
	    ans += '\n';
	}
	return hide + clear + go(0,0) + ans + "\n" + show;
    }

    public KnightsTour(int size){
	board = new int[size][size];
    }
    
    
    public void solve(){
	
    }

    public void solve(int startx, int starty){
				
    }


		
    public boolean solve(int x,int y,int currentMoveNumber){
	if (outOfBounds(x) || outOfBounds(y)){
	    return false;
	}
	if (currentMoveNumber == (board.length * board.length) + 1){
	    return true;
	}
	if (board[x][y] == 0){
	    System.out.println(this);
	    wait(100);
	    board[x][y] = currentMoveNumber;
	    if (solve(x+1,y+2,currentMoveNumber + 1) ||
		solve(x-1,y+2,currentMoveNumber + 1) ||
		solve(x+1,y-2,currentMoveNumber + 1) ||
		solve(x-1,y-2,currentMoveNumber + 1) ||
		solve(x+2,y+1,currentMoveNumber + 1) ||
		solve(x+2,y-1,currentMoveNumber + 1) ||
		solve(x-2,y+1,currentMoveNumber + 1) ||
		solve(x-2,y-1,currentMoveNumber + 1)){
		return true;
	    }
	    board[x][y] = 0;
	}
	return false;
    }

    public boolean outOfBounds(int c){
	if (c < 0 || c >= board.length){
	    return true;
	}
	return false;
    }

    public static void main(String[]args){
	KnightsTour k = new KnightsTour(6);
	System.out.println(k.solve(0,0,1));
	
    }

}