
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        String[] AString = A.split("(?!^)");
        String[] BString = B.split("(?!^)");

        System.out.println(AString.length + BString.length);

        if ( A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        for( int i = 0; i < AString.length; i++){
            if (i == 0){
                System.out.print(AString[i].toUpperCase(Locale.ROOT));
            }else{
                System.out.print(AString[i]);
            }
        }

        for( int i = 0; i < BString.length; i++) {
            if (i == 0) {
                System.out.print(" " + BString[i].toUpperCase(Locale.ROOT));
            } else {
                System.out.print(BString[i]);
            }
        }
    }
}



//    Given two strings of lowercase English letters,  and , perform the following operations://
//        Sum the lengths of  and .
//        Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//        Capitalize the first letter in  and  and print them on a single line, separated by a space.
