package objectOrientedThinking;

public class Test_392_10_25 {

    public static void main(String[] args) {
        String s = "Hi Good Morning Mostafiz";
        System.out.println(m(s));
    }

    public static int m(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
