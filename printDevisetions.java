import java.util.Scanner;

public class printDevisetions {

    private static void test(){       

        for(int i=115; i<=445; i++){
            if(i%2!=0 ){
                if(i%7==0 && i%3 != 0){
                System.out.println(i);
                }
            }
            

        }

    }

    public static void main(String[] args) {
        test();
    }
}
