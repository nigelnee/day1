package day1;

//分别利用for循环打印 9*9  表?

public class Practise1for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 1;  i <= 9; i++)
		    {
		      for(int n = 1; n <= i; n++)
		      {
		        System.out.print( i + " * " + n + " = " + i * n + "   ");
		      }
		      System.out.println();
		  }

	}

}
