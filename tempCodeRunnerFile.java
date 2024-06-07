public class Pattern {
    public static void main(String[] args) {
        int n = 5; // number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for better visualization
                }
            }
            System.out.println(); // Just println() is enough to move to the next line
        }
    }
}
