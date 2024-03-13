package programs_scannerclasses;

import java.util.Scanner;

public class RevString_SC {
	static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Give the input");
	String s=sc.nextLine();
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(reverse(s1[i])+" ");
		}
	}

}
