import java.util.Scanner;

class baekjoon2577 {
    public static void main(String[] args) {
        int input1 = 0, input2 = 0, input3 = 0;
        int[] output = new int[10];
        String mul = null;
        Scanner sc = new Scanner(System.in);
        input1 = sc.nextInt();
        input2 = sc.nextInt();
        input3 = sc.nextInt();

        mul = String.valueOf(input1 * input2 * input3);

        for(int i = 0; i < mul.length(); i++) {
            ++output[mul.charAt(i) - 48];
        }
        for(int i = 0; i < 10; i++)
            System.out.println(output[i]);

    }
}