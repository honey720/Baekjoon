import java.util.Scanner;

class BOJ_C01_L11_11720 {
    public static void main(String[] args) {
        int input1 = 0, output = 0;
        String input2 = null;

        Scanner sc = new Scanner(System.in);
        input1 = sc.nextInt();
        input2 = sc.next();

        for(int i = 0; i < input1; i++) {
            output += input2.charAt(i) - 48;
        }

        System.out.println(output);

    }
}