/*
Create a method that will reverse the array sent to it.
 */

public class WarmUp6_4 {
    public static void main(String[] args) {
        String[] array = {"A","B","C","D","E"};
        printArray(array);
                                    //CALL METHOD HERE
        printArray(array);
    }

    public static void printArray(String a[]) {
        System.out.print("[ ");
        for (int x = 0; x < a.length; x++) {
            System.out.print( a[x] );
            if(x != a.length - 1)
                System.out.print(", ");
        }
        System.out.println(" ]");
    }

    //YOUR CODE HERE
}
