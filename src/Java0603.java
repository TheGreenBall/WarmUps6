// Java0603.java
// This program demonstrates how to initialize array elements.
// The <new> operator is not necessary in this case.


public class Java0603
{
	public static void main(String args[])
	{
		System.out.println("Java0603\n");
		int list[] = {11,22,33,44,55,66,77,88,99};
		for (int k = 0; k < 9; k++)
			System.out.println("list[" + k + "] = " + list[k]);
		System.out.println();
	}
}

