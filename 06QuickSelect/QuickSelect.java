import java.util.*;
public class QuickSelect{
	public static void partition(int[]ary, int si, int ei){
		System.out.println(Arrays.toString(ary));
		int[] D = new int[ary.length];
		for(int i = 0; i < ary.length; i++){
			if(i < si || i > ei){
				D[i] = ary[i];
			}
		}
		int start = si;
		int end = ei;
		int ri = si + (int)(Math.random() * (ei - si + 1));
		int pivot = ary[ri];
		System.out.println("Pivot: " + pivot);
		for(int i = start; i <= end; i++){
			if(ary[i] < ary[pivot]){
				D[start] = ary[i];
				start++;
				System.out.println(Arrays.toString(D));
			}
			if(ary[i] > ary[pivot]){
				D[end] = ary[i];
				end--;
				System.out.println(Arrays.toString(D));
			}
			System.out.println(Arrays.toString(D));
		}
		D[si] = ary[pivot];
		System.out.println(Arrays.toString(D));
	}

	public static void main(String[]args){
		int[]test = {3,5,7,2,8,9,1,0,4,6};
		QuickSelect a = new QuickSelect();
		a.partition(test,0,test.length - 1);
	}
}