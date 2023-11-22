import java.util.Scanner;

class baekjoon2884 {
    public static void main(String[] args) {
        int input1 = 0, input2 = 0;
        int output1 = 0, output2 = 0;

        Scanner sc = new Scanner(System.in);
        input1 = sc.nextInt();
        input2 = sc.nextInt();

        output1 = input1;
        output2 = input2 - 45;
        if(output2 < 0) {
            output2 += 60;
            output1 -= 1;
        }
        if(output1 < 0)
            output1 += 24;

        System.out.println(output1 + " " + output2);
    }
}