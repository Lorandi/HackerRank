import java.util.Arrays;
import java.util.Scanner;

public class LexicographicalOrder {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        Boolean bigger = false;
        Boolean smaller = false;

        String[] stringArray = s.split("(?!^)");
        String[] substring = new String[k];
        String[] bigSubstring = new String[k];
        String[] smallSubstring = new String[k];

        for (int i = 0; i < k; i++) {
            substring[i] = stringArray[i];
            bigSubstring[i] = stringArray[i];
            smallSubstring[i] = stringArray[i];
        }

        for (int i = 0; i < stringArray.length - (k - 1); i++) {
            for (int j = 0; j < k; j++) {
                substring[j] = stringArray[i + j];
            }

            for (int l = 0; l < substring.length; l++) {
                if ((int) substring[l].charAt(0) > (int) bigSubstring[l].charAt(0)) {
                    bigger = true;
                    break;
                } else if ((int) substring[l].charAt(0) < (int) bigSubstring[l].charAt(0)) {
                    bigger = false;
                    break;
                }
            }
            if (bigger) {
                for (int j = 0; j < k; j++) {
                    bigSubstring[j] = substring[j];
                }
            }
            for (int l = 0; l < substring.length; l++) {
                if ((int) substring[l].charAt(0) < (int) smallSubstring[l].charAt(0)) {
                    smaller = true;
                    break;
                } else if ((int) substring[l].charAt(0) > (int) smallSubstring[l].charAt(0)) {
                    smaller = false;
                    break;
                }
            }
            if (smaller) {
                for (int j = 0; j < k; j++) {
                    smallSubstring[j] = substring[j];
                }
            }
        }

        for (int x = 0; x < k; x++) {
            largest += bigSubstring[x];
        }

        for (int x = 0; x < k; x++) {
            smallest += smallSubstring[x];
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
        String s = "fsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH\n";
//        int k = scan.nextInt();
        int k = 100;
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}