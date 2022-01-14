
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        String[] arrayA = a.split("(?!^)");
        String[] arrayB = b.split("(?!^)");
        String temp;

        if (arrayA.length != arrayB.length) {
            return false;
        }

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = arrayA[i].toLowerCase();
            arrayB[i] = arrayB[i].toLowerCase();

            for (int j = i + 1; j < arrayA.length; j++) {
                arrayA[j] = arrayA[j].toLowerCase();
                if ((int) arrayA[i].charAt(0) > (int) arrayA[j].charAt(0)) {
                    temp = arrayA[j];
                    arrayA[j] = arrayA[i];
                    arrayA[i] = temp;
                }

                arrayB[j] = arrayB[j].toLowerCase();
                if ((int) arrayB[i].charAt(0) > (int) arrayB[j].charAt(0)) {
                    temp = arrayB[j];
                    arrayB[j] = arrayB[i];
                    arrayB[i] = temp;
                }
            }
            if (arrayA[i].charAt(0) != arrayB[i].charAt(0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
        String a = "anaGram";
        String b = "margaNa";
//        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
