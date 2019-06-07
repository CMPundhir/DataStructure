import java.util.Scanner;
class BinarySearch{
	//iterative method
	public static int binarySearch(int[] arr,int x){
		int l,r,m;
		l=0;
		r=arr.length;
		while(l<=r){
			m = l + (r - l)/2;
			if(arr[m]==x){
				return m;
			}else if(arr[m]<x){
				l = m + 1;
			}else{
				r = m -1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,20,143,34,45,56,67,7,78,89,9,90,90};
		int[] sortedArr = Sorting.sort(arr);
		Sorting.printArr(sortedArr);
		int x = sc.nextInt();
		int index = binarySearch(sortedArr,x);
		System.out.println(index);
	}
}