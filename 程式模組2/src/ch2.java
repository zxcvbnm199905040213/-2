import java.util.Scanner;

public class ch2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cm = scn.nextInt();
        int x = scn.nextInt();
        if (x==1){
            System.out.println((cm-80)*0.7f);
        }else {
            System.out.println((cm-70)*0.6);
        }
    }
}