import java.util.Scanner;

/**
 * sumOflast
 */
public class sumOflast {

     public static void getIn(){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value of a :");
        int a = sc.nextInt();
        
        System.out.print("enter value of b :");
        int b = sc.nextInt();

        System.out.println("||");

        test(a,b);
    }

    private static void test(int a, int b){
        int sum = (a%10)+(b%10);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        getIn();
    }
}