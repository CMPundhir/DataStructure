package recur;

import java.util.Scanner;

class FindTable{
	
	public static void callTable(int number, int base){
		if(base>10){
			return;
		}
		
		System.out.println(number+"*"+base+"="+(number*base));
		callTable(number,++base);
			
			
	} 
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for find table: ");
		int number = sc.nextInt();
		int base = 1;
		callTable(number,base);
	}
}