import java.util.Scanner;

public class ch5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        int v1 = 0 ;
        char[] x = a.toCharArray();
        for (int i = 0 ; i< x.length ; i++){
            int c = x[i]-'0';
            v1+=c;
        }
        System.out.println(v1);
    }
}
