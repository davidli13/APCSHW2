import java.util.*;
import java.io.*;
public class Maze{
    //terminal keycode to clear the terminal, or hide/show the cursor
    private static final String clear =  "\033[2J";
    private static final String hide =  "\033[?25l";
    private static final String show =  "\033[?25h";
    private static final int DFS = 1;
    private static final int BFS = 0;    
    
    private char[][] maze;
    private int maxx,maxy;
    private int startx,starty;
    
    //terminal specific character to move the cursor
    private String go(int x,int y){
	return ("\033[" + x + ";" + y + "H");
    }  

    private String color(int foreground,int background){
	return ("\033[0;" + foreground + ";" + background + "m");
    }

    public void clearTerminal(){
	System.out.println(clear);
    }

    public void wait(int millis){
	try {
	    Thread.sleep(millis);
	}
	catch (InterruptedException e) {
	}
    }

    
    /** Same constructor as before...*/
    public Maze(String filename){
	startx = -1;
	starty = -1;
	//read the whole maze into a single string first
	String ans = "";
	try{
	    Scanner in = new Scanner(new File(filename));

	    //keep reading next line
	    while(in.hasNext()){
		String line = in.nextLine();
		if(maxy == 0){
		    //calculate width of the maze
		    maxx = line.length();
		}
		//every new line add 1 to the height of the maze
		maxy++;
		ans += line;
	    }
	}
	catch(Exception e){
	    System.out.println("File: " + filename + " could not be opened.");
	    e.printStackTrace();
	    System.exit(0);
	}

	//copy from the single string to a 2D array
	maze = new char[maxx][maxy];
	for(int i = 0; i < ans.length(); i++){
	    char c = ans.charAt(i);
	    maze[i % maxx][i / maxx] = c;
	    if(c == 'S'){
		startx = i % maxx;
		starty = i / maxx;
	    }
	}
    }

    public String toString(){
	//do not do the funky character codes
	return "";
    }

    public String toString(boolean animate){
	//do the funky character codes when animate is true
	return "";
    }
    

    /**Solve the maze using a frontier in a BFS manner. 
     * When animate is true, print the board at each step of the algorithm.
     * Replace spaces with x's as you traverse the maze. 
     */
    public boolean solveBFS(boolean animate){
	return false;
    }

    /**Solve the maze using a frontier in a DFS manner. 
     * When animate is true, print the board at each step of the algorithm.
     * Replace spaces with x's as you traverse the maze. 
     */
    public boolean solveDFS(boolean animate){  
	return false;
    }
    
    public boolean solveBFS(){

	return solveBFS(false);
    }
    public boolean solveDFS(){
	int x = startx;
	int y = starty;
	if(maze[x][y] == 'E'){
	    return true;
	}
	if(maze[x][y] == ' '){
	    //mark the floor with @
	    maze[x][y] = '@';
	    //recursion ho!!
	    /*
	      if( solve(x + 1,y) ||
		solve(x,y + 1) ||
		solve(x - 1,y) ||
		solve(x,y - 1)){
		return true;
		}
	    */
	    //replace the @ with a .
	    maze[x][y] = '.';
	}
	return false;//by default the maze didn't get solved
	//return solveDFS(false);	
    }
    /**return an array [x1,y1,x2,y2,x3,y3...]
     *that contains the coordinates of the solution from start to end.
     *Precondition :  solveBFS() OR solveDFS() has already been called
     (otherwise an empty array is returned)
     *Postcondition:  the correct solution is in the returned array
     */
    public int[] solutionCoordinates(){
	int[] ans = new int[1];
	return ans;
    }  
}