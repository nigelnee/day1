package day1;

public class Demo1 {
//定义变量
//类型 变量名 = 变量值；
	String name = "dd";
	int age = 1999;
	char d = 'a';	
	static int sum;
	static int sub;
	static int ji;
	static int sang;
	public static void main(String[] args) {
		//定义变量，运算
		int a = 12;
		int b = 22;
		
		sum = a+b;
		sub = a-b;
		ji = a*b;
		sang = a%b;
		
		System.out.println("a+b="+sum);
		System.out.println("a-b="+sub);
		System.out.println("a*b="+ji);
		System.out.println("a%b="+sang);
	}
			
}
