import java.util.Scanner;
 class MyLinearSearch{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int myArray[] = {10,20,30,40,90,80};
		System.out.print("Enter Element to search: ");
		int key = sc.nextInt();
		for(int i=0;i<myArray.length;i++){
			if(myArray[i]==key){
				System.out.println("We Found it");
				return;
			}
		}
		System.out.println("Sorry! Not Found");
	}
	
 }