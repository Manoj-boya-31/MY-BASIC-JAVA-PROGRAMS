public class stringbasic {
    public static void main(String[] args) {
        // TO CONCATE THE STRING USING +
        String a = "Manoj";
        String b = "Boya";
        System.out.println(a + b);
        System.out.println();

        // TO SHOW IMMUTABILITY PROPERTY OF STRINGS
        String c = "VIJAY";
        System.out.println(c);
        c = "Thalapathy";
        System.out.println(c);
        System.out.println();

        // TO SHOW HOW TO COMPARE STRINGS USING ==
        String m = "balayya";
        String n = "balayya";
        System.out.println(m == n);
        System.out.println();

        // WHAT IS CharAt() in JAVA STRINGS
        String str = "Hello world";
        char z = str.charAt(1);
        System.out.println(z);
        System.out.println();

        // FROM CHAR ARRAY TO STRINGS
        char ma[] = { 's', 'u', 'p', 'e', 'r' };
        String cd = new String(ma);
        System.out.println(cd);
        // returns string length below of string(cd)
        System.out.println("string length is: " + cd.length());
        System.out.println();

        // substring uses in java
        String zz = "collegemate";
        String maddy = zz.substring(0); // Starts with 0 and goes to end
        System.out.println(maddy);
        String noddy = zz.substring(5, 10); // Starts from 5 and goes to 10
        System.out.println(noddy);
        String saddy = zz.substring(5, 15); // Returns Exception
        System.out.println(saddy);
        System.out.println();

        // stringname.contains() uses in java to check the presence of word
        String name = "I love you";
        System.out.println(name.contains("love"));
        System.out.println(name.contains("hate"));
        System.out.println();

        // splits the string based on whitespace using java foreach loop to print
        // elements of string array
        String s1 = "balayya is very famous";
        String[] words = s1.split("\\s");
        for (String w : words)
            System.out.println(w);
        System.out.println();

        // To check whether same strings in a program
        String km = "Manoj";
        String mk = "Manoj";
        String lm = "MANOJ";
        String nm = "manojBoya";
        System.out.println(km.equals(mk));// true because content and case is same
        System.out.println(km.equals(lm));// false because case is not same
        System.out.println(km.equals(nm));// false because content is not same
        System.out.println();

        // TO CHECK INDEX OF CHARACTER IN A STRING
        String ai = "this is index of example";
        // passing substring
        int index1 = ai.indexOf("is");// returns the index of is substring
        int index2 = ai.indexOf("index");// returns the index of index substring
        System.out.println(index1 + "  " + index2);// 2 8
    }
}