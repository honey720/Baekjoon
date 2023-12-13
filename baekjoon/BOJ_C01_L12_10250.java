import java.util.Scanner;

class BOJ_C01_L12_10250 {
    public static void main(String[] args) {
        int input1= 0, input2= 0, input3= 0, input4 = 0;
        int output1 = 0, output2 = 0;

        Scanner sc = new Scanner(System.in);
        input1 = sc.nextInt(); //The number of test case
        int[] output = new int[input1];
        int count = 0;

        while(count < input1){
            input2 = sc.nextInt(); //height
            input3 = sc.nextInt();	//width
            input4 = sc.nextInt(); //The number of customer

            if(input2 < 1 || input2 > 99)
                break;
            else if(input3 < 1 || input3 > 99)
                break;
            else if(input4 < 1 || input4 > input2 * input3)
                break;
            else {
                if(input4 % input2 == 0)
                    output1 = input2 * 100;
                else
                    output1 = input4 % input2 * 100;

                if(input4 % input2 == 0)
                    output2 = input4 / input2;
                else
                    output2 = input4 / input2 + 1;


                output[count] = output1 + output2;
                System.out.println(output[count]);
                ++count;
            }
        }
    }
}