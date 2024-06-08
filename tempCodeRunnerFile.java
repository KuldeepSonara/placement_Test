public class tempCodeRunnerFile {
    public static void main(String[] args) {
        int n = 5; // number of rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for better visualization
                }
            }
            System.out.println(); // Just println() is enough to move to the next line
        }
    }
}
