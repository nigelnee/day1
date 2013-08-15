package day1;
//分别利用 while循环打印 9*9  表?

public class Practise1while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		 
		 while (i <= 9)
		    {
			int n=1;
		      while(n<=i)
		      {
		        System.out.print( i + " x " + n + " = " + i * n + " ");
		      
		      n++;
		      }
		      
		      
		      i++;
		          
		      System.out.println();
		  }
		 
		 
	}

}
