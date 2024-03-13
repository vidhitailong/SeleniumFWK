package Array_programs;

public class ArrayMain {
	public static void main(String[] args) 
	{
		print_F_Array();
		print_R_Array();
	}

static void print_F_Array()
{
	int[] arr= {2,4,5,3,7,6,5};
	int count=0;
	for(int i=0; i<=arr.length-1;i++)
	{
		if(arr[i]%2==0)
		{
			count++;
			System.out.println(arr[i]);
		}
	}
	System.out.println(count);
}

	static void print_R_Array() 
	{
		int[] abb = {2,4,5,3,7,6,5};
		int count = 0;
		for (int i = abb.length-1; i >= 0; i--) 
		{
			if (abb[i] % 2 == 1) {
				count++;
				System.out.println(abb[i]);
			}
		}
		System.out.println(count);
	}

}
