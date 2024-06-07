import java.util.Scanner;

public class primeNumber {
    public static void getIn(){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value to check number is prime or not :");
        int a= sc.nextInt();

        System.out.println("||");

        boolean res = checkPrime(a);
        
        if(res == false){
            System.out.println("there numbre is not a prime number : " + a);
        }
        else{
            System.out.println("there numbre is a prime number : " + a);
        }
    }

    private static boolean checkPrime(int a){
        for(int i = 2; i<a/2; i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        getIn();
    }
}
