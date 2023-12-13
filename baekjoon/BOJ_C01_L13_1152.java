import java.util.Scanner;
import java.util.StringTokenizer;

class BOJ_C01_L13_1152 {
    public static void main(String[] args) {
        String a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(a , " ");

        System.out.println(st.countTokens());
        scanner.close();
    }
}