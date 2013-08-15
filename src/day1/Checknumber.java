package day1;

public class Checknumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number  = args[0];
		int num = Integer.parseInt(number);
		
		if (num % 2!=0){
			System.out.println("是奇数");
		}else{
			System.out.println("不是奇数");
		}
	}

}
