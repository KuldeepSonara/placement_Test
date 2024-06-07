import java.util.Scanner;

public class sumOfOddnadEven {

    public static void getIn(){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of arrya :");
        int a = sc.nextInt();

        int[] arr = new int[a];
        

        for(int i=0; i<a; i++){
            System.out.print("enter valu of postion : " + i + " = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("||");

        test(arr);
    }

    private static void test(int[] a){
        int sumOdd = 0;       
        int sumEven = 0;

        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                sumEven += a[i];
            }
            else{
                sumOdd += a[i];
            }

        }
        System.out.println("sume of odd is :" + sumEven);
        System.out.println("sum of even number is :" + sumOdd);

    }

    public static void main(String[] args) {
        getIn();
    }
}
