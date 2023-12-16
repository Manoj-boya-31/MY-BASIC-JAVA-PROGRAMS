import java.util.*;

public class ArrayMultiarrays {
    public static void main(String args[]) {
        try (Scanner ma = new Scanner(System.in)) {
            int[][] klmn = new int[3][2];
            System.out.println(klmn.length);

            for (int row = 0; row < klmn.length; row++) {
                for (int column = 0; column < klmn[row].length; column++) {
                    klmn[row][column] = ma.nextInt();
                }
            }

            System.out.println("Multi-dimensional array elements are");
            for (int row = 0; row < klmn.length; row++) {
                for (int column = 0; column < klmn[row].length; column++) {
                    System.out.print(klmn[row][column] + "");
                }
                System.out.println();

            }
        }
    }
}
