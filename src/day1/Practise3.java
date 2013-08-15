package day1;
//求500以内完备数
public class Practise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=1;
		int sum=0;
		
		while(i<=500){
		    sum = 0;
		    j=1;
		     while(j<=(i/2))//约数不可能超过一半
		    	 {
		      
		       if(i%j==0){
		    	   
		        sum=sum+j;
		                }
		       j++;
		       }
		     
		    if(sum==i){
		     System.out.println(sum+" ");
		     i++;
		     }
		    else i++;
		   }
	}
}

