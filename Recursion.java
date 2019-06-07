package recur;
class Recursion{
	public static int fact(int i){
		if(i<2){
			System.out.print(i+" = ");
			return i;
		}
		System.out.print(i+" * ");
		return i*fact(--i);
	}
	public static void main(String[] arssdxwasz){
		int num = 5;
		int res = fact(num);
		System.out.println(res);
	}
}