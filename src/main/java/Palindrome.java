import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
        String A="ana";

        boolean isPalindrome = true;

        String[] word = A.split("(?!^)");

        for (int i = 0; i < word.length/2; i++){
            if(!word[i].equals(word[word.length -1 - i])){
                isPalindrome = false;
            }
        }

        if(isPalindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
