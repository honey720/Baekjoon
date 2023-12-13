import java.util.Scanner;

public class BOJ_C02_L13_15829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String input2 = sc.next();
        long output = 0;
        long a = 1;

        for(int i = 0; i < input2.length(); i++) {
            long tmp = (input2.charAt(i) - 96);
            output += (long)tmp * a;
            a *= 31;
            a %= 1234567891;
            output %= 1234567891;
        }
        System.out.print(output);
    }
}