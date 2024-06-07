import java.util.Scanner;

/**
 * max3
 */
public class max3 {

    public static void getIn(){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value of a :");
        int a= sc.nextInt();
        System.out.print("enter value of b :");
        int b =sc.nextInt();
        
        System.out.print("enter value of c :");
        int c =sc.nextInt();
        System.out.println("||");
        int res = maxTest(a, b, c);
        System.out.println("max number is form thoss : "+ a +", "+ b+", " + c+" max is : " + res );
    }

    private static int maxTest(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else {
            return c;
        }
    }

    public static void main(String[] args) {
        getIn();
    }
}