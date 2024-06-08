import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicateFromArray {

    public static void getInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        
        for(int i = 0; i < size; i++){
            System.out.print("Enter value at position " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("||");

        removeDuplicates(arr);
    }

    private static String $(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '$'");
    }

    private static void removeDuplicates(int[] arr){
        Arrays.sort(arr);
        int[] newArr = new int[arr.length];
        int j = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i+1]){
                newArr[j++] = arr[i];
            }
        }
        newArr[j] = arr[arr.length - 1]; // Adding the last element

        printArray(newArr);
    }

    private static void printArray(int[] arr){
        System.out.println("Array without duplicates:");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){ // Printing only non-zero elements
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        getInput();
    }
}
