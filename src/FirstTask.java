import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkifPalendrome(s) ? "YES" : "NO");
    }

    static boolean checkifPalendrome(String s) {
        if(isPalendrome(s)) return true;
        for (int i = 0; i < s.length(); i++) {
            String newString = s.substring(0, i) + s.substring(i + 1);
            if (isPalendrome(newString)) return true;
        }
        return false;
    }

    static boolean isPalendrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
