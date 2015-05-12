import java.util.*;
public class MyHeap{
    public ArrayList<Integer> data;
    public int levels;
    public boolean maxHeap;
    
    public MyHeap(){
	data = new ArrayList<Integer>();
	data.add(0);
	levels = 0;
	maxHeap = true;
    }
    
    public MyHeap(boolean isMax){
	data = new ArrayList<Integer>();
	data.add(0);
	levels = 0;
	maxHeap = isMax;	
    }
    public String toString(){
	return data.toString();
    }
    
    public int remove(){
	data.set(0, (data.get(0)-1));
	return data.remove(1);
    }
    
    public void add(int i){
	if (data.get(0) == 0){
	    data.add(i);
	}else{
	    data.add(i);
	}
	data.set(0, (data.get(0)+1));
    }
    
    public int peek(){
	return data.get(1);
    }
         
    public static void main(String[]args){
	MyHeap h = new MyHeap();
	h.add(7);
	h.add(9);
	h.add(10);
	h.remove();
	System.out.println(h.toString());
	System.out.println(h.peek());
    }     
}