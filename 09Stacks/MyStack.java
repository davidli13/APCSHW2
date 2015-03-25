import java.util.*;
public class MyStack<T>{
    private MyLinkedList<T> list;
    public T peek(){
       	if (list.size() == 0){
	    throw new EmptyStackException();
	}
	return list.get(0);
    }
    
    public boolean pop(){
	if(list.size() == 0){
	    throw new EmptyStackException();
	}
	return list.remove(0);
    }
    
    public void push(T item){
	list.add(0, item);
    }
}

