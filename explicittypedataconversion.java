public class explicittypedataconversion 
{
    public static void main(String args[]) 
    {
        double a = 9876.5876;
        System.out.println("double representation: " + a);

        float b = (float) a;
        System.out.println("float representation: " + b);

        long c = (long) b;
        System.out.println("long representation: " + c);

        int d = (int) c;
        System.out.println("int representation: " + d);
    }
}
