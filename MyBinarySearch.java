import java.util.Scanner;
Class MyBinarySearch{
	
	public static void sort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int minimum = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minimum]){
					int temp;
					temp = arr[j];
					arr[j] = arr[minimum];
					arr[minimum] = temp;
				}
			}
		}
		
		int start = 0,end = array.length;
		binarysearch(arr,start,end);
	}
	
	public void binarysearch(int[] arr,int start,int end){
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();
			int mid = (start+end)/2;
			while(start<=end){
				if(arr[mid]==key){
					System.out.print("Found");
				}else if(key<arr[mid]){
					end = mid-1;
				}else if(key>a){
					
				}
			}
			
	}
	
	public static void main(String[] args){
		int[] arr = {10,30,20,50,40};
		sort(arr);
	}
}