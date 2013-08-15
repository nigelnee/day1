
		package day1;
		// 求 2/1+3/2+5/3+8/5+13/8.....前20项之和？
		public class Practise5 {

			public void main(String[] args) {
				double sum=0;
				double t ;
				double Z=2.0, M=1.0;    //初始的分子 (Z)＝2，分母(M)＝1

				for(int i=1; i<=20; i++){

				sum =sum + Z / M ;
				
				t=M;			//M赋给临时变量t
				
				M = Z;           //下一项的分母 ＝ 上一项的分子
				
				Z =Z + t;         //下一项的分子 ＝ 上一项的分子加分母

				}

				System.out.println("sum= "+sum);
			}

		}

		
