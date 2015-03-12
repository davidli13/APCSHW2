public class MyLinkedList{
    public LNode head;
    
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
	temp = head;
	while(temp.getNext() != null){
	    size++;
	    temp = temp.getNext();
	}
	return size + 1;
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
	l.add(5);
	l.add(2);
	l.add(13);
	System.out.println(l.toString());
	
    }
}