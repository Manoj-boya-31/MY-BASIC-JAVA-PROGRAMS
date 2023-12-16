public class StringBooleanContains {
    public static void main(String[] args) {
        String str = "Hello fake love generation";
        boolean isContains = str.contains("fake love");
        System.out.println(isContains);
        // Case Sensitive
        System.out.println(str.contains("fakelove")); // false
    }
}