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
    
    public String name(){
	return "li.david";
    }

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
		ans += board[r][c] + " ";
		if (board[r][c] < 10){
		    ans += ' ';
		}
	    }
	    ans += '\n';
	}
	//	return hide + clear + go(0,0) + ans + "\n" + show;
	return ans + "\n";
    }

    public KnightsTour(int size){
	board = new int[size][size];
    }
    
    
    public void solve(){
	solve(0,0);
    }

    public void solve(int startx, int starty){
	solve(startx,starty,1);
    }


		
    public boolean solve(int x,int y,int currentMoveNumber){

	if (outOfBounds(x) || outOfBounds(y)){
	    return false;
	}	
	if (currentMoveNumber == board.length * board.length & board[x][y] == 0){
	    board[x][y] = currentMoveNumber;
	    return true;
	}
	if (board[x][y] == 0){
	    if (currentMoveNumber == 16){
	    }
		
	    
	    
	    //wait(1000);
	    board[x][y] = currentMoveNumber;
	    System.out.println(currentMoveNumber);
	    System.out.println(this);
	    
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
	KnightsTour k = new KnightsTour(4);
	k.solve(0,0);
	System.out.println(k);
    }

}
