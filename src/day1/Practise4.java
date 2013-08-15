package day1;
//求  a+aa+aaa+.......+aaaaaaaaa=?
public class Practise4 {
//      求  a+aa+aaa+.......+aaaaaaaaa=?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int a;
		String gh=args[0];
		a = Integer.parseInt(gh);
		int a1=a;  // 用来保存 a 的初始值

		for (int i=1; i<=9; i++){

		sum+= a;

		a = 10*a +a1;   // 这表示a 的下一项

		// 每次 a 的下一项都等于前一项*10，再加上刚输入时的 a ；

		
		}
		System.out.println("a+aa+aaa+.......+aaaaaaaaa="+sum);
	}
}