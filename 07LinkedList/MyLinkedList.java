public class MyLinkedList{
    public LNode head,current;
    
    public String toString(){
	String s = "[";
	current = head;
	while (current.getNext() != null){
	    s += current.getValue() + ",";
	    current = current.getNext();
	}
	s += current.getValue() + "]";
	return s;
    }

    public int get(int index){
	return 0;
    }
    public int get(int index, int value){
	return 0;
    }

    public boolean add(int value){
	return true;
    }
    public boolean add(int index, int value){
	return true;
    }

    public boolean remove(int index){
	return true;
    }

    public int size(){
	int size = 0;
	current = head;
	while(current.getNext() != null){
	    size++;
	    current = current.getNext();
	}
	return size + 1;
    }

    public int indexOf(int value){
	return 0;
    }

}