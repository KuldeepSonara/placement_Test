import java.util.Scanner;

public class printSerie {
    public static void getIn(){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value to of setsps :");
        int a = sc.nextInt();

        System.out.println("||");

        test(a);
    }

    private static void test(int a){
        int n = 1;
        int sum = 0;
        for(int i=1; i<=a ; i++){
            sum = n + sum;
            System.out.print(sum+" ");
            n+=1;
        }
    }

    public static void main(String[] args) {
        getIn();
    }
}
