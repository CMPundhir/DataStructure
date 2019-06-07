import java.util.Scanner;
class LinearSearch{
	public static void main(String[] args){
		int[] arr = {1,23,23,4,54,6,788,89,5,6,78,9,0,7,5,3,2,1};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ; i<arr.length ; i++){
			if(arr[i] == n){
				System.out.println("item found at "+i);
				return;
			}
		}
		System.out.println("item not found");
	}
}