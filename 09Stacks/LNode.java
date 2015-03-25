public class LNode<T>{
    private T value;
    private LNode<T> next;
    
    public LNode<T> getNext(){
	return next;
    }
    
    public void setNext(LNode<T> l){
	next = l;
    }

    public T getValue(){
	return value;
    }

    public void setValue(T i){
	value = i;
    }

    public String toString(){
	return "" + value;
    }

    public LNode(){
    }
    public LNode(T v){
	value = v;
    }
    public LNode(T v, LNode<T> n){
	value = v;
	next = n;
    }

}