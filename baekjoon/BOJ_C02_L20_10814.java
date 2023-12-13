import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_C02_L20_10814 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] input = new String[n][2];

        for(int i = 0; i < n; i++) {
            input[i][0] = sc.next();
            input[i][1] = sc.next();
        }

        Arrays.sort(input, new Comparator<String[]>() {

            public int compare(String s1[], String s2[]) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        for(int i = 0; i < n; i++) {

            System.out.println(input[i][0] + " " + input[i][1]);

        }
        sc.close();
    }
}