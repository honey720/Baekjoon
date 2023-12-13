import java.util.Scanner;

class BOJ_C01_L01_1008 {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a/b);

        scanner.close();
    }
}