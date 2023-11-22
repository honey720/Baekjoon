import java.util.Scanner;

class baekjoon10950 {
    public static void main(String[] args) {
        int input1 = 0;

        Scanner scanner = new Scanner(System.in);
        input1 = scanner.nextInt();
        int[][] input2 = new int[input1][2];
        int[] output = new int[input1];

        for(int i = 0; i < input1; i++) {
            input2[i][0] = scanner.nextInt();
            input2[i][1] = scanner.nextInt();
            output[i] = input2[i][0] + input2[i][1];
        }

        for(int i = 0; i < input1; i++)
            System.out.println(output[i]);
    }
}