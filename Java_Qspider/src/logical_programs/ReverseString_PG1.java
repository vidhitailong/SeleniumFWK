package logical_programs;

public class ReverseString_PG1 {
	
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
		String s="This is my world";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(reverse(s1[i])+" ");
		}
	}

}
