import java.util.Scanner;

class BOJ_C01_L01_2741 {
    public static void main(String[] args) {
        int input;
        int output = 1;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        for(int i = 0; i < input; i++) {
            System.out.println(output);
            ++output;
        }
    }
}