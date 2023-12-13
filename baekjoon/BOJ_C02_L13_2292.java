import java.util.Scanner;

public class BOJ_C02_L13_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 1;
        int tmp = 1;
        for(long i = 1; i < 1666666666; i++) {
            tmp += (i * 6);
            if(input == 1)
                break;
            else if(tmp >= input) {
                ++count;
                break;
            }
            else {
                ++count;
            }
        }
        System.out.print(count);
    }
}