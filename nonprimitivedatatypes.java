public class nonprimitivedatatypes 
{
    public static void main(String args[]) 
    {
        String str = "Hello World!";
        System.out.println("String: " + str);

        String str1 = new String("Hello World!");
        System.out.println("String: " + str1);

        int arr[];
        arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr);
        System.out.println(arr[0]);
    }
}
