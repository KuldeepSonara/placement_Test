import java.util.Scanner;

public class elacctricityBille {
   public static void getIn(){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter unites :");
        int a = sc.nextInt();

        System.out.println("||");

        test(a);
    } 

    private static void test(int unit){
        double bill = 0.0;
        if(unit <= 200){
            bill = unit * 0.8 ;
        }else if (unit <= 300) {
            int unit300 = unit-200;
            bill = unit300 * 0.9;
            bill = bill + (unit - unit300) * 0.8;
        } else {
            bill = unit * 1;
        }

        bill += 100;

        if(bill > 300){
            bill = bill + ((bill*12.36)/100);
        }

        System.out.println("bill is : " + bill);
    }

    public static void main(String[] args) {
        getIn();
    }
}
