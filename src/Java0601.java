// Java0601.java
// This program demonstrates how to declare an array of integers.
// Note how each element of the array defaults to zero.
// Java allows the display of uninitialized objects because object elements
// get assigned values from the default constructor.


public class Java0601
{
	public static void main(String args[])
	{
		System.out.println("Java0601\n");
		int list[];             			// declares the array object identifier
		list = new int[10];     			// allocates memory for 10 array elements
		for (int k = 0; k < 10; k++)
			System.out.println("list[" + k + "] = " + list[k]);
		System.out.println();
	}
}

