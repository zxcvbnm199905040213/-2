import java.util.Scanner;

public class ch10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,c,d;
        a=scn.nextInt();
        b=scn.nextInt();
        c=scn.nextInt();
        d=scn.nextInt();
        double a1=((c*60)+d)-((a*60)+b);

        if(a1<=120){

            int a2=(int)(a1/30);
            System.out.println(a2*30);

        }else if(a1>120 && a1<=240){

            int a2=(int)((a1-120)/30);
            System.out.println((a2*40)+120);

        }else if(a1>240){

            int a2=(int)((a1-240)/30);
            System.out.println((a2*60)+280);
        }
    }
}