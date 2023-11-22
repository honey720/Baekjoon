import java.util.Scanner;

class baekjoon27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        int input2 = sc.nextInt();
        char output = input1.charAt(input2 - 1);

        System.out.print(output);
    }
}