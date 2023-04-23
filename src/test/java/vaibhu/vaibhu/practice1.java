package vaibhu.vaibhu;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// m3();
		// name();
		// m2();
		//m4();
		nii();
	}

	// public static void m2()
	{
		String s1 = "saurabh";

		char[] a = s1.toCharArray();

		for (int i = 0; i <= s1.length() - 1; i++) {
			if (i != ' ' && i == 0) {
				System.out.println(a[i]);
			}

		}

	}

	public static void name() {

		String s1 = "saurabhsasa";

		System.out.println(s1.replaceFirst("s", ""));

	}

	public static void m3() {

		String ad = "thakur";

		// System.out.print(ad.charAt(ad.length()-1));
		/*
		 * StringBuffer sb= new StringBuffer(ad);
		 * 
		 * sb.deleteCharAt(sb.length()-1);
		 * 
		 * System.out.println(sb);
		 */
		System.out.println(ad.substring(0, ad.length() - 1));

	}

	public static void m4() {
		String aa = "qwerty";

		String a1 = "";
		for (int i = 0; i <= aa.length() - 1; i++) {
			// System.out.println(aa.charAt(i));

			if (i != aa.length() - 1) {
				a1 = a1 + aa.charAt(i);
			}

		}
  System.out.println(a1);
  
  
  
  
	}

	
	
	
	
	
	public static void nii()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		
		
	if(n %5 ==0  &&  n % 11 ==0)
	{
		System.out.println("divisble by 5 and 11");
			
		}else {
			System.out.println("not ");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
