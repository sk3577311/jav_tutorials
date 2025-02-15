package programs;

public class stars {

    // right programs.stars triangle
    static void rightTriangleStar(int x) {
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    // left programs.stars triangle
    static void StarleftTriangle(int x) {
        int i, j;
        for (i = 1; i < x; i++) {
            for (j = 2 * (x - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // left programs.stars triangle
    static void reverseTriangle(int number) {
        // Declaring and initializing variable to
        // Size of the pyramid

        int i = number, j;

        // Nested while loops
        // Outer loop

        // Till condition holds true
        while (i > 0) {
            j = 0;

            // Inner loop
            // Condition check
            while (j++ < number - i) {
                // Print whitespaces
                System.out.print(" ");
            }

            j = 0;

            // Inner loop
            // Condition check
            while (j++ < (i * 2) - 1) {
                // Print star
                System.out.print("*");
            }

            // By now, we reach end of execution for one row
            // so next line
            System.out.println();

            // Decrementing counter because we want to print
            // reverse of pyramid
            i--;
        }
    }
}
