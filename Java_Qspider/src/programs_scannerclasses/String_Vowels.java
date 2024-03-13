package programs_scannerclasses;

import java.util.Scanner;

public class String_Vowels {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		String s1=s.toLowerCase();
		char[] s2= s1.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			if(s2[i]=='a'||s2[i]=='e'||s2[i]=='i'||s2[i]=='o'||s2[i]=='u')
			{
				System.out.print(s2[i]);
			}
		}
	}

}
