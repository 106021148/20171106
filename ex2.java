import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        if(val>=1000&&val<=9999){
            if((val%4==0 && val%100!=0)||val%400==0){
                System.out.println("Bissextile Year");
            }
        }else {
            System.out.println("Common Year");
        }
    }
}
