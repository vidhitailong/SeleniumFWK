package logical_programs;

public class StringReverse {
	
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
		String s="This is thursday";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==0)
			System.out.print(reverse(s1[i])+" ");
			else
				System.out.print(s1[i]+" ");
		}
	}

}
