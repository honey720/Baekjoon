import java.util.Scanner;

class BOJ_C01_L01_1330 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        String result;
        result = (a > b) ? ">" : "<";
        if(a == b) result = "==";
        System.out.println(result);
    }
}