import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        if(val >= 1&&<=12){
           if(val>=3&&<=5){
                System.out.println("Spring");
            }
            else if (val>=6&&val<=8){
                System.out.println("Summer");
            }
            else if (val>=9&&val<=11){
                System.out.println("Autumn");
            }
            else {
                System.out.printf("Winter");
            }
        }
    }
}
