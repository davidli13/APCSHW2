public class LNode{
    private int value;
    private LNode next;
    
    public LNode getNext(){
	return next;
    }
    
    public void setNext(LNode l){
	next = l;
    }

    public int getValue(){
	return value;
    }

    public void setValue(int i){
	value = i;
    }

    public String toString(){
	return "" + value;
    }

    public LNode(){
    }
    public LNode(int v){
	value = v;
    }
    public LNode(int v, LNode n){
	value = v;
	next = n;
    }

}