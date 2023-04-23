package vaibhu.vaibhu;

public class newpeli {
	
	public static void main(String[] args) {
		
	int n=123, r = 0, s=0;	
	while(n>0) {
		
		n=n%10;
		n=n/10;
		s=s*10+r;
	}
	if(s==n) {
		System.out.println("pelindrom no");
	}
	else{System.out.println("no");}
	}

}
