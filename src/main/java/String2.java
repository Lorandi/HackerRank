import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String S = in.next();
        String S = "Helloworld";
//        int start = in.nextInt();
        int start = 3;
        int end = 7;
//        int end = in.nextInt();

        String[] strings = S.split("(?!^)");

        for( int i = start; i < end; i++){
            System.out.print(strings[i]);
        }
    }
}

///lowo