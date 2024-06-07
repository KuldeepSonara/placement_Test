import java.util.Scanner;

public class palidromOrNot {
    public static void getIn(){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value to check number is palidrom or not :");
        String a = sc.nextLine();

        System.out.println("||");

        boolean res = checkPalidrom(a);
        
        if(res == false){
            System.out.println("there numbre is not a palidrom number : " + a);
        }
        else{
            System.out.println("there numbre is a palidrom number : " + a);
        }
    }

    private static boolean checkPalidrom(String a){
        int start = 0;
        int last = a.length()-1;
    
        while (start<last) {
            if(a.charAt(last) != a.charAt(start)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
    public static void main(String[] args) {
        getIn();
    }
}
