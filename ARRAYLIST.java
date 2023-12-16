import java.util.ArrayList;

public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<String> ListManoj = new ArrayList<>(10);

        ListManoj.add("INDIA");
        ListManoj.add("Australia");
        ListManoj.add("new zealand");
        ListManoj.add("swiss");
        ListManoj.add("USA");
        ListManoj.add("england");
        ListManoj.add("germany");
        ListManoj.add("china");
        ListManoj.add("korea");
        ListManoj.add("brazil");
        ListManoj.add("africa");

        System.out.println(ListManoj);
        System.out.println(ListManoj.contains("swiss"));
        System.out.println(ListManoj);
        System.out.println(ListManoj.contains("pakistan"));
        System.out.println();
        ListManoj.set(3, "Switzerland");
        ListManoj.remove(9);
        System.out.println(ListManoj);
    }
}
