import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicateFromArray {

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

        remove(arr);
    }

    private static void remove(int[] arr){
        Arrays.sort(arr);
        int[] arr1 = new int[arr.length-1];
        int j =0;
        for(int i = 1; i<=arr.length-1; i++){
            if(arr[i] != arr[i-1]){
                arr1[j] = arr[i-1];
                j++;
            }
        }

        print(arr1);
    }

    private static void print(int[] a){

        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

    }

    public static void main(String[] args) {
        getIn();
    }
}
