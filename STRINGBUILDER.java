public class STRINGBUILDER {
    public static void main(String args[]) {
        StringBuilder manoj = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            manoj.append(ch);
        }
        //append() method concatenates the given argument with this String.
        System.out.println(manoj.toString());

        //delete() method of StringBuilder class deletes the string from the specified beginIndex to endIndex.
        manoj.deleteCharAt(0);
        System.out.println(manoj.toString());

        //reverse() metho d of StringBuilder class reverses the current string.
        manoj.reverse();
        System.out.println(manoj.toString());

        //insert() method inserts the given string with this string at the given position.
        manoj.insert(1, "ALPAHBAET");
        System.out.println(manoj.toString());

        // replace() method replaces the given string from the specified beginIndex and endIndex.
        manoj.replace(25,26, "z");
        System.out.println(manoj.toString());
    }
}
