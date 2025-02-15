package programs;

public class pallindrome {

    // to check palindrome number
    static void pallindromenum(int n) {
        int rem, sum = 0, temp;
        temp = n;
        while (n > 0) {
            rem = n % 10; // getting remainder
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

    // to check palindrome number
    static boolean pallindromeString(String string) {
        String reverse = new StringBuilder(string).reverse().toString();
        return string.equals(reverse);
    }
}
