import java.util.Arrays;

public class arraySwap 
{
    public static void main(String args[])
    {
        int[] man={1,3,23,9,18};
        swap(man,1,3);
        swap(man,0,4);
        System.out.println(Arrays.toString(man));
    }
    static void swap(int[] man,int index1,int index2)
    {
        int temp=man[index1];
        man[index1]=man[index2];
        man[index2]=temp;
    }
}