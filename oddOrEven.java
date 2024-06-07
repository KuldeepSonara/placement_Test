import java.util.Scanner;

public class oddOrEven {
    public static void getIn(){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value to of a :");
        int a = sc.nextInt();

        System.out.println("||");

        boolean res = test(a);
        
        if(res == false){
            System.out.println("there numbre is odd nagative : " + a);
        }
        else{
            System.out.println("there numbre is a even number : " + a);
        }
    }
    
     private static boolean test(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        getIn();
    }
}
