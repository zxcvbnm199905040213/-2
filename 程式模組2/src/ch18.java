import java.util.Scanner;

public class ch18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num,sum=0;
        num = scn.nextInt();
        for(int a=3;a<=num;a=a+3){
            sum+=a;
        }
        System.out.println(sum);
    }
}