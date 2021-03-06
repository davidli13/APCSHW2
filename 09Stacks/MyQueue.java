import java.util.*;
public class MyQueue<T>{
    MyLinkedList<T> list;

    public T peek(){
	if (list.size() == 0){
	    throw new IndexOutOfBoundsException();
	}
	return list.get(0);
    }

    public void enqueue(T a){
	list.add(a);
    }

    public boolean dequeue(){
	if (list.size() == 0){
	    throw new IndexOutOfBoundsException();
	}
	return list.remove(0);
    }
}
