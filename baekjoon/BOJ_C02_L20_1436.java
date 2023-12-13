import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_C02_L20_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int N = Integer.valueOf(input);

        int count = 1;
        int frontNum = 0;

        while(N >= count) {

            if(N == 1) {
                System.out.print("666");
                break;
            }
            else {
                switch(String.valueOf(frontNum).length()) {
                    case 1: {

                        if(String.valueOf(frontNum).charAt(0) == '6') {
                            if(N < count + 10) {
                                int backNum = 0 + (N - count);
                                String backStr = String.valueOf(backNum);
                                System.out.print(frontNum + "66" + backStr);
                            }
                            count += 9;
                        } //6
                        else {
                            if(N == count)
                                System.out.print(String.valueOf(frontNum) + "666");
                        }	//x
                        break;
                    }
                    case 2:{
                        if(String.valueOf(frontNum).charAt(1) == '6') {
                            if(String.valueOf(frontNum).charAt(0) == '6') {
                                if(N < count + 100) {
                                    int backNum = 0 + (N - count + 100);
                                    String backStr = String.valueOf(backNum);
                                    System.out.print(frontNum + "6" + backStr.charAt(1) + backStr.charAt(2));
                                }
                                count += 99;
                            } //66
                            else {
                                if(N < count + 10) {
                                    int backNum = 0 + (N - count);
                                    String backStr = String.valueOf(backNum);
                                    System.out.print(frontNum + "66" + backStr);
                                }
                                count += 9;
                            }	//x6
                        }
                        else {
                            if(N == count)
                                System.out.print(String.valueOf(frontNum) + "666");
                        }	//xx
                        break;
                    }
                    default: {
                        if(String.valueOf(frontNum).charAt(String.valueOf(frontNum).length() - 1) == '6') {
                            if(String.valueOf(frontNum).charAt(String.valueOf(frontNum).length() - 2) == '6') {
                                if(String.valueOf(frontNum).charAt(String.valueOf(frontNum).length() - 3) == '6') {
                                    if(N < count + 1000) {
                                        int backNum = 0 + (N - count + 1000);
                                        String backStr = String.valueOf(backNum);
                                        System.out.print(frontNum + "" + backStr.charAt(1) + backStr.charAt(2) + backStr.charAt(3));
                                    }
                                    count += 999;
                                } //666
                                else {
                                    if(N < count + 100) {
                                        int backNum = 0 + (N - count + 100);
                                        String backStr = String.valueOf(backNum);
                                        System.out.print(frontNum + "6" + backStr.charAt(1) + backStr.charAt(2));
                                    }
                                    count += 99;
                                }	//x66
                            }
                            else {
                                if(N < count + 10) {
                                    int backNum = 0 + (N - count);
                                    String backStr = String.valueOf(backNum);
                                    System.out.print(frontNum + "66" + backStr);
                                }
                                count += 9;
                            }	//xx6
                        }
                        else {
                            if(N == count)
                                System.out.print(String.valueOf(frontNum) + "666");
                        }	//xxx
                        break;
                    }
                }
                ++count;
                ++frontNum;
            }
        }
    }
}