import java.util.Scanner;

class baekjoon10871 {
    public static void main(String[] args) {
        int input1, input2;
        String output;
        Scanner scanner = new Scanner(System.in);
        input1 = scanner.nextInt();
        input2 = scanner.nextInt();

        System.out.println(input1 + input2);
        System.out.println(input1 - input2);
        System.out.println(input1 * input2);
        System.out.println(input1 / input2);
        System.out.println(input1 % input2);
    }
}