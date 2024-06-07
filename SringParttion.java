import java.util.Scanner;

public class SringParttion {
    public static void getIn(){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string :");
        String a = sc.nextLine();

        System.out.println("||");

        print(a);
    } 

    private static void print(String a){
        for(int i = 0; i<a.length(); i++){
            for(int j=0; j<=i; j++){
                System.out.print(a.charAt(i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        getIn();
    }
}
