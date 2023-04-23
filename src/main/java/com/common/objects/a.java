package com.common.objects;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
//		 fibonnaci serise
//		1,1,2,3
		
		int i=1 ;int n=10 ; int ft=0; int st=1;
		 
		
		while(i<= n) {
			System.out.print(ft+" ");
			int temp=ft+st;
			ft=st;
			st=temp;
			
			i++;
			
			
		}
		
		
		

	}

}
