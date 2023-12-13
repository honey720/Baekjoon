import java.util.Scanner;

public class BOJ_C00_L11_2480 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int intArrDice[] = new int[3];
        int Max = 0;

        for(int i=0; i <intArrDice.length; i++) {
            intArrDice[i] = scanner.nextInt();
            if(intArrDice[i] > Max)
                Max = intArrDice[i];
        }

        if(intArrDice[0] == intArrDice[1] && intArrDice[0] == intArrDice[2] && intArrDice[1] == intArrDice[2])
            System.out.print(10000 + intArrDice[0] * 1000);
        else if(intArrDice[0] == intArrDice[1])
            System.out.print(1000 + intArrDice[0] * 100);
        else if(intArrDice[0] == intArrDice[2])
            System.out.print(1000 + intArrDice[0] * 100);
        else if(intArrDice[1] == intArrDice[2])
            System.out.print(1000 + intArrDice[1] * 100);
        else
            System.out.print(Max * 100);

        scanner.close();
    }
}