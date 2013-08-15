package day1;
//从命令行接受一个参数年份，计算此年份是否为闰年?
import java.util.Scanner;
public class Practise2 {
	private static Integer i;
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);

		int ab=in.nextInt();


		//String year = args[0];
		//2类型转换，使用系统工具
		//int a = Integer.parseInt(year);
		//3运算并判断结果
		if ((ab%4==0 && ab%100!=0)|| ab%400==0)
			System.out.println("是闰年");
		else
			System.out.println("不是闰年");
	}

	
	
	
}
