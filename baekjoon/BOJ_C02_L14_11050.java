import java.util.Scanner;

public class BOJ_C02_L14_11050 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int tmp1 = 1, tmp2 = 1, tmp3 = 1;

        for(int i = N; i > 0; i--) {
            tmp1 *= i;
        }
        for(int i = K; i > 0; i--) {
            tmp2 *= i;
        }
        for(int i = N - K; i > 0; i--) {
            tmp3 *= i;
        }

        int output = tmp1/(tmp2 * tmp3);
        System.out.print(output);
        sc.close();
    }
}