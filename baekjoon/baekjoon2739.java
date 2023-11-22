import java.util.Scanner;

class baekjoon2739 {
    public static void main(String[] args) {
        int input;
        int gugudan = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        for(int i = 1; i < 10; i++) {
            gugudan = input * i;
            System.out.println(input + " * " + i + " = " + gugudan);
        }
    }
}