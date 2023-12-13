import java.util.Scanner;

class BOJ_C01_L01_1001 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = a-b;
        System.out.println(c);

        scanner.close();
    }
}