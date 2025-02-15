package programs;

public class printPascal {
    public static void PascalNums(int k) {
        int line, a = 1, b = 0;
        for (line = 1; line <= k; line++) {
            for (b = 0; b <= k - line; b++) {

                // Print whitespace for left spacing
                System.out.print(" ");
            }

            // Variable used to represent C(line, i)
            int C = 1;

            for (a = 1; a <= line; a++) {

                // The first value in a line is always 1
                System.out.print(C + " ");

                C = C * (line - a) / a;
            }

            // By now, we are done with one row so
            // a new line is required
            System.out.println();
        }
    }
}