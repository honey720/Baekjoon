import java.util.Scanner;

public class BOJ_C02_L14_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        float[] input2 = new float[input1];
        float output = 0;
        float max = 0;
        for(int i = 0; i < input1; i++) {
            input2[i] = sc.nextInt();
            if(input2[i] > max)
                max = input2[i];
        }
        for(float i: input2) {
            output += i / max * 100;
        }
        System.out.println(output / input1);
        sc.close();
    }
}