import java.util.*;
import java.io.*;

public class MyDeque<T> {

    private T[] items;
    private int head;
    private int tail;
    private int size;    

    public MyDeque() {
	items = (T[]) (new Object[10]);
	head = 0;
	tail = 9;
	size = 0;
    }
    public int getHead(){
	return head;
    }
    public int getTail(){
	return tail;
    }

    private int normalize(int n) {
	while (n < items.length) {
	    n += items.length;
	}
	return n % items.length;
    }

    private void resize() {
	int newSize = size;
	if (size == items.length) {
	    newSize = size * 2;
	} else {
	    return;
	}
    
	T[] newArray = (T[]) (new Object[newSize]);
	int copyCounter = 0;
	if (head <= tail) {
	    for (int i = head; i <= tail; ++i) {
		newArray[copyCounter] = items[i];
		copyCounter++;
	    }
	} else {
	    for (int i = head; i < items.length; ++i) {
		newArray[copyCounter] = items[i];
		copyCounter++;
	    }
	    for (int i = 0; i <= tail; ++i) {
		newArray[copyCounter] = items[i];
		copyCounter++;
	    }
	}
	head = 0;
	tail = size - 1;
	items = newArray;
    }

    public boolean add(T item) {
	addLast(item);
	return true;
    }
    public void add(T item, int priority){
	resize();
	addLast(item);
	size++;
    }

    public void addFirst(T item) {
	resize();
	head = normalize(head - 1);
	items[head] = item;
	size++;
    }

    public void addLast(T item) {
	resize();
	tail = normalize(tail + 1);
	items[tail] = item;
	size++;
    }
    public T get(int index){
	if (head < tail){
	    if (index < head || index > tail){
		throw new ArrayIndexOutOfBoundsException();
	    }
	}else{
	    if (index > tail && index < head){
		throw new ArrayIndexOutOfBoundsException();
	    }
	}
	if (size == 0){
	    throw new NoSuchElementException();
	}
	return items[index];
    }
    public T getFirst() {
	if (size == 0) {
	    throw new NoSuchElementException();
	}
	return items[head];
    }

    public T getLast() {
	if (size == 0) {
	    throw new NoSuchElementException();
	}
	return items[tail];
    }

    public T removeFirst() {
	if (size == 0) {
	    throw new NoSuchElementException();
	}
	size--;
	int index = head;
	head = normalize(head + 1);
	return items[index];
    }

    public T removeLast() {
	if (size == 0) {
	    throw new NoSuchElementException();
	}
	size--;
	int index = tail;
	tail = normalize(tail - 1);
	return items[index];
    }
    
    public T removeSmallest(){
	return items[0];
    }

    public int size() {
	return size;
    }

    public String toString() {
	if (size == 0) {
	    return "[ ]";
	}
	String out = "[ ";
	if (head <= tail) {
	    for (int i = head; i <= tail; ++i) {
		out += items[i] + " ";
	    }
	} else {
	    for (int i = head; i < items.length; ++i) {
		out += items[i] + " ";
	    }
	    for (int i = 0; i <= tail; ++i) {
		out += items[i] + " ";
	    }
	}
	return out + "]";
    }
}