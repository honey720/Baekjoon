import java.util.Scanner;

class BOJ_C01_L01_2475 {
    public static void main(String[] args) {
        int[] input = new int[5];
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            input[i] = scanner.nextInt();
            input[i] *= input[i];
            result += input[i];
        }
        result %= 10;
        System.out.println(result);
    }
}