import java.util.Scanner;

public class findDectionOrderP13 {

    public static void getInput(){
        Scanner scanner = new Scanner(System.in);

        // Accept three integer values from the user
        System.out.println("Enter three integer values of 1:");
        int a = scanner.nextInt();
        System.out.println("Enter three integer values of 2:");
        int b = scanner.nextInt();
        System.out.println("Enter three integer values of 3:");
        int c = scanner.nextInt();

        System.out.println("||");

        test(a, b, c);
    }

    private static void  test(int a, int b, int c){
        int min = (a<b) ? ((a<c)? a : c) : ((b<c) ? b : c);
        int max = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
        int mid = (a+b+c) - max - min;
        System.out.println("Values in ascending order: " + min + " " + mid + " " + max);
    }
    public static void main(String[] args) {
        getInput();
    }
}
