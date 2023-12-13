import java.util.Scanner;

class BOJ_C01_L12_10818 {
    public static void main(String[] args) {
        int input1= 0, count = 0;
        int min = 1000000, max = -1000000;
        Scanner sc = new Scanner(System.in);
        input1 = sc.nextInt(); //The number of test case
        int[] input2 = new int[input1];

        while(count < input1) {
            input2[count] = sc.nextInt();
            if(input2[count] > max)
                max = input2[count];
            if(input2[count] < min)
                min = input2[count];
            ++count;
        }
        System.out.print(min + " " + max);
    }
}