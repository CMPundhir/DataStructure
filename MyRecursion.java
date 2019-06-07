package recur;
import java.util.Scanner;
class MyRecursion {
	
	public static int fact(int no){
		if(no<2){
			return no;
		}
		
		return no*fact(--no);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to find fatorial: ");
		int no = sc.nextInt();
		System.out.print("Factorial: "+fact(no));
		
	}
}