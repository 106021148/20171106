import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        int b =scn.nextInt();
        switch (a){
            case  1 :
                if (b >=1 && b<=20){
                    System.out.println("Capricorn");
                }
                if(b>=21 && b <=31){
                    System.out.println("Aquarius");
                }break;
            case 2 :
                if (b>=1 && b<=18){
                    System.out.println("Aquarius");
                }
                if (b>=19 && b<=28){
                    System.out.println("Pisces");
                }break;
            case  3:
                if (b>=1 && b<=20){
                    System.out.println("Pisces");
                }
                if (b>=21 && b<=31){
                    System.out.println("Aries");
                }break;
            case 4 :
                if (b>=1 && b<=20){
                    System.out.println("Aries");

                }
                if (b>=21 && b<=30){
                    System.out.println("Taurus");
                }break;
            case 5:
                if (b>=1 && b<=21){
                    System.out.println("Taurus");

                }
                if (b>=22 && b<=30){
                    System.out.println("Cancer");

                }break;
            case 6 :
                if (b>=1 && b<=21 {
                System.out.println("Gemini");
            }
            if (b>=22 && b<=30){
                System.out.println("Cancer");
            }break;
            case 7 :
                if (b>=1 && b<=22){
                    System.out.println("Canner");
                }
                if (b>=23 && b<=31){
                    System.out.println("Leo");
                }break;
            case 8 :
                if (b>=1 && b<=23){
                    System.out.println("Leo");
                }
                if (b>=24 && b<=31){
                    System.out.println("Virgo");
                }break;
            case 9 :
                if (b>=1 && b<=23){
                    System.out.println("Virgo");

                }
                if (b>=24 && b<=30){
                    System.out.println("Libra");



        }break;
            case 10 :
                if (b>=1 && b<=22) {
                    System.out.println("Scorpio");
                }
                    if (b>=24 && b<=31){
                        System.out.println("Scorpio");
                }break;
            case 11 :
                if (b>=1 && b<=22){
                    System.out.println("Scorpio");
                }
                if (b>=23 && b<=30){
                    System.out.println("Sagittarius");
                }break;
            case 12:
                if (b>=1 && b<=21){
                    System.out.println("Sagittarius");
                }
                if (b>=22 && b<=31){
                    System.out.println("Capricorn");
                }break;

                }
    }
}
