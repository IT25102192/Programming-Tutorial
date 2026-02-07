public class Calculator {
	public static int add (int a,int b){
		return a +b;
	}
	public static int multiply (int a,int b){
		return a*b;
	}
	public static int square (int a){
		return a*a;
	}
	public static void main(String[]args){
		System.out.print("1.(3*4+5*7)² = ");
		System.out.println(square(add(multiply(3,4),multiply(5,7))));
		
		System.out.print("2.(4+7)²+(8+3)² = ");
		System.out.print(add((square(add(4,7))),(square(add(8,3)))));
	}
}
