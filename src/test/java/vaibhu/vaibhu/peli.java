package vaibhu.vaibhu;

public class peli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,temp, s=0;
		int n=343;
		
		temp=n;
		
		  while(n>0) {
			  r=n%10;
			  s= (s*10)+r;
			  n=n/10;
			  
		  }
		  if (temp==s) {
			  System.out.println("pelsindrom number");
		  }
		  else {
			  System.out.println("not a pelindrom number");
		  }
		  

	}

}
