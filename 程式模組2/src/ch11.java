import java.util.Scanner;

public class ch11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int M = scn.nextInt();
        if (M>=3 && M<=5){
            System.out.println("Spring");
        }else if (M>=6 && M<=8){
            System.out.println("Summer");
        }else if (M>=9 && M<=11){
            System.out.println("Autumn");
        }else {
            System.out.println("Winter");
        }
    }
}
