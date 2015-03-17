public class MyLinkedList<T>{
    public LNode<T> head,tail;
    public int size_;
    
    public MyLinkedList(){
    }
    public MyLinkedList(T value){
	head = new LNode<T>(value);
	size_ = 1;
    }

    public String name(){
	return "li.david";
    }

    public String toString(){
	LNode<T> temp = head;
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

    public T get(int index){
	if (index < 0 || index > size_){
	    throw new ArrayIndexOutOfBoundsException();
	}
	LNode<T> current = head;
	while (index > 0){
	    current = current.getNext();
	    index--;
	}
	return current.getValue();
    }

    public void set(int index, T value){
	if (index < 0 || index > size_){
	    throw new ArrayIndexOutOfBoundsException();
	}
	LNode<T> current = head;
        while (index > 0){
            current = current.getNext();
	    index--;
        }
        current.setValue(value);
    }

    public boolean add(T value){
	if (head == null){
	    head = new LNode<T>(value);
	    size_++;
	    return true;
	}
	LNode<T> temp = new LNode<T>(value);
        LNode<T> current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
	size_++;
	return true;
    }
    public boolean add(int index, T value){
	if (index < 0 || index > size_){
	    throw new ArrayIndexOutOfBoundsException();
	}
	LNode<T> temp = new LNode<T>(value);
        LNode<T> current = head;

        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }

        temp.setNext(current.getNext());
        current.setNext(temp);

        size_++;
	return true;
    }
    
    public boolean remove(int index){
	if (index < 0 || index > size_){
	    throw new ArrayIndexOutOfBoundsException();
	}
	
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
    public int indexOf(T value){
	int i = 0;
	LNode<T> temp = head;
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
	MyLinkedList<Integer> l = new MyLinkedList<Integer>();
	l.add(6);
	l.add(45);
	l.add(2);
	l.add(1,99);
	l.set(0,56565);
	System.out.println("toString: " + l);
	System.out.println("Get(2): " + l.get(2));
	System.out.println("Size: " + l.size());
	System.out.println("indexOf: " + l.indexOf(60));
    }
}