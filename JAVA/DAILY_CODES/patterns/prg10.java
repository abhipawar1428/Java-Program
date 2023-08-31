/*
1
2*2
3*3*3
3*3*3
2*2
1
*/

import java.util.*;
class pattern{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
			for(int j=1;j<i;j++){
				System.out.print(i+"*");
			}
			System.out.println(i);
		}
		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row-i;j++){
				System.out.print(num +"*");
			}
			System.out.println(num--);
		}
		
	}
}
