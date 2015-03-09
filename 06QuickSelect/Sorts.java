import java.util.*;
public class Sorts{
    public static void partition(int[]ary, int si, int ei){
	System.out.println(Arrays.toString(ary));
	int[] D = new int[ary.length];
	int start = si;
	int end = ei;
	int ri = si + (int)(Math.random() * (ei - si + 1));
	int pivot = ary[ri];
	System.out.println("Pivot: " + pivot);
	for(int i = si; i <= end; i++){
	    if(ary[i] < pivot){
		D[si] = ary[i];
		si++;
	    }
	    if(ary[i] > pivot){
		D[end] = ary[i];
		end--;
	    }
	}
	D[si] = pivot;
	System.out.println(Arrays.toString(D));
    }

    public static int quickSelect(int[] ary, int n){
	return 0;
    }

    public static void quicksort(int[] a){
	
    }

    public static void main(String[]args){
	Sorts a = new Sorts();
	int[]test = {3,5,7,2,8,9,1,0,4,6};
	a.partition(test,0,test.length - 1);
    }
}