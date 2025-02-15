package programs;

public class StringPrograms {
    public void reverseString(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Reversed String: " + reversed);

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
        System.out.println(rev == reversed);
    }
}
