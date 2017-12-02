import java.util.Scanner;

public class ch13 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        while( scn.hasNext() ){
            int a = scn.nextInt();

            if( (a % 4 == 0 && a % 100 != 0) || a % 400 == 0 )
                System.out.println("Bissextile Year");
            else
                System.out.println("Common Year");
        }

    }
}

