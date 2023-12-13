import java.util.Scanner;

class BOJ_C01_L12_2562 {
    public static void main(String[] args) {
        int index = 9;
        int[] input = new int[index];
        int[] output = new int[2];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < index; i++) {
            input[i] = sc.nextInt();
        }

        output = find(input, 0, index - 1);

        System.out.println(output[0]);
        System.out.println(output[1] + 1);

    }
    public static int[] find(int[] input, int min, int max) {
        int[] result = new int[2];
        if(max - min <= 1)
        {
            result[0] = input[min] > input[max] ? input[min] : input[max];
            result[1] = input[min] > input[max] ? min : max;
        }
        else
            result = find(input, min, (min + max) / 2)[0] > find(input, (min + max) / 2 + 1, max)[0] ? find(input, min, (min + max) / 2) : find(input, (min + max) / 2 + 1, max);

        return result;
    }
}