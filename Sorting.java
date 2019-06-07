class Sorting{
	public static void printArr(int[] arr){
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}
	//Selction sort
	public static int[] sort(int myArray[]){
		for(int i=0;i<myArray.length;i++){
			int minimum = i;
			for(int j=i+1;j<myArray.length;j++){
				if(myArray[j]<myArray[minimum]){
					int temp;
					temp = myArray[j];
					myArray[j] = myArray[minimum];
					myArray[minimum] = temp;
				}
			}
		}
		return myArray;
	}
	public static void main(String[] args){
		int[] arr = {1,23,23,4,54,6,788,89,5,6,78,9,0,7,5,3,2,1};
		sort(arr);
		printArr(arr);
	}
}