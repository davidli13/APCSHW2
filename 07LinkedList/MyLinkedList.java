public class MyLinkedList{
    public LNode head,tail;
    public int size_;
    
    public MyLinkedList(){
    }
    public MyLinkedList(int value){
	head = new LNode(value);
	size_ = 1;
    }
    
    public String toString(){
	LNode temp = head;
	String s = "";
	if (temp.getNext() == null){
	    s = "[ ";
	}else{
	    s = "[";
	}
	while (temp != null){
	    s += temp.getValue() + ",";
	    temp = temp.getNext();
	}
	return s.substring(0,s.length() - 1) + "]";
    }

    public int get(int index){
	LNode current = head;
	while (index > 0){
	    current = current.getNext();
	    index--;
	}
	return current.getValue();
    }
    public int get(int index, int value){
	return 0;
    }

    public boolean add(int value){
	if (head == null){
	    head = new LNode(value);
	    size_++;
	    return true;
	}
	LNode temp = new LNode(value);
        LNode current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
	size_++;
	return true;
    }
    public boolean add(int index, int value){
	if (head == null){
	    head = new LNode(value);
	    size_++;
	    return true;
	}
	LNode temp = new LNode(value);
        LNode current = head;
        while (index > 0){
            current = current.getNext();
	    index--;
        }
        current.setNext(temp);
	size_++;
	return true;
    }
    
    public boolean remove(int index){

	size_--;
	return true;
    }
    
    public int size(){
	return size_;
	/*
	int size = 0;
	temp = head;
	while(temp.getNext() != null){
	    size++;
	    temp = temp.getNext();
	}
	return size + 1;
	*/
    }
    public int indexOf(int value){
	int i = 0;
	LNode temp = head;
	while (temp.getNext() != null){
	    if(temp.getValue() == value){
		return i;
	    }
	    temp = temp.getNext();
	    i++;
	}
	return -1;
    }

    public static void main(String[]args){
	MyLinkedList l = new MyLinkedList();
	l.add(6);
	l.add(45);
	l.add(2);
	l.add(1,9);
	System.out.println("toString: " + l);
	System.out.println("Get(1): " + l.get(1));
	System.out.println("Size: " + l.size());
    }
}