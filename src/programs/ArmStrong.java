package programs;// import java.math.*;

public class ArmStrong {
    static void ArmStrongNums(int x) {
        int sum = 0;
        int n = x;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, 3);
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}