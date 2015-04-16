import java.util.*;
import java.io.*;
public class Maze{
    //terminal keycode to clear the terminal, or hide/show the cursor
    private static final String clear =  "\033[2J";
    private static final String hide =  "\033[?25l";
    private static final String show =  "\033[?25h";
    private static final int DFS = 1;
    private static final int BFS = 2;  
    private static final int Best = 3;  
    private static final int AStar = 4;
  
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
	String ans = "";
	for (char[] i : maze) {
	    for (char j : i) {
		ans += j;
	    }
	    ans += "\n";
	}
	return ans;
    }
    
    public String toString(boolean animate){
	//do the funky character codes when animate is true
	if (animate){
	    try {
		Thread.sleep(100);
	    }
	    catch (InterruptedException e){
	    }
	    return clear + hide + toString();
	}
	return toString();
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
    public void solveDFS(){
	toString();
	int x = startx;
	int y = starty;
	if(maze[x][y] == 'E'){
	}
	maze[x][y] = '.';   
	//by default the maze didn't get solved  
	//return solveDFS(false);	
    }

    public boolean solveBest(){
	return solveBest(false);
    }
    
    public boolean solveBest(boolean animate){
	return false;
    }

    public boolean solveAStar(){
	return solveAStar(false);
    }

    public boolean solveAStar(boolean animate){
	return false;
    }

    /*return an array [x1,y1,x2,y2,x3,y3...]
     *that contains the coordinates of the solution from start to end.
     *Precondition :  solveBFS() OR solveDFS() has already been called
     (otherwise an empty array is returned)
     *Postcondition:  the correct solution is in the returned array
     */
    public int[] solutionCoordinates(){
	int[] ans = new int[1];
	return ans;
    }  
    public static void main(String[] args) {
	Maze m = new Maze("data3.dat");
	m.solveDFS(true);
	m.toString();
    }
}