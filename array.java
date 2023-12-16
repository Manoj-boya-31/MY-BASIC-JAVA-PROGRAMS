import java.util.*;
public class array 
{
    public static void main(String args[])
    {
        try (Scanner mt = new Scanner(System.in)) {
            int[] arr= new int[5];
            arr[0]=7;
            arr[1]=69;
            arr[2]=143;
            arr[3]=420;
            arr[4]=999;
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[3]);
            System.out.println(arr[4]);

            System.out.println("Enter the elements");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]= mt.nextInt();
            }
            // enhanced for loop
            System.out.println("Entered elements of the array:");
            for(int num:arr) // for every element in above array to print the element.
            {
                System.out.println(num +""); // here num represents element of the array.
            }
        }
    }
}
