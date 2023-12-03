import java.util.Scanner;

public class baekjoon2839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = calc(N);
        System.out.print(result);
    }

    public static int calc(int N) {
        for (int i = N / 5; i >= 0 ; i--) {
            int temp = N - (5 * i);
            if(temp == 0) {
                return i;
            }
            else if (temp >= 3) {
                for(int j = temp / 3; j >= 0; j--) {
                    int temp2 = temp - (3 * j);
                    if(temp2 == 0) {
                        return i + j;
                    }
                }
            }
        }
        return -1;
    }
}
