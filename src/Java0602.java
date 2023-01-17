// Java0602.java
// This program is almost identical to Java1101.  The difference 
// is that the array declaration and array definition to allocate 
// memory is done in one program statement.


public class Java0602
{
	public static void main(String args[])
	{
		System.out.println("Java0602\n");
		int list[] = new int[10];  					// combined array declaration and definition  
		for (int k = 0; k < 10; k++)
			System.out.println("list[" + k + "] = " + list[k]);
		System.out.println();
	}
}

