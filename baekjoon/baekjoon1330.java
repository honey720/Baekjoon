import java.util.Scanner;

class baekjoon1330 {
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