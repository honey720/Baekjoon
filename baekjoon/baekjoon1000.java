import java.util.Scanner;

class baekjoon1000{
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = a + b;
        System.out.println(c);

        scanner.close();
    }
}