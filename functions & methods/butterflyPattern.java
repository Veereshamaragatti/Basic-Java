public class butterflyPattern {
    public static void butterfly(int n) {
        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print the first part of the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print the spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  "); // Two spaces to align with the stars
            }
            // Print the second part of the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) { // Corrected loop condition
            // Print the first part of the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print the spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  "); // Two spaces to align with the stars
            }
            // Print the second part of the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(15);
    }
}
