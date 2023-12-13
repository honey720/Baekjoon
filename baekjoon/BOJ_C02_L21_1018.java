import java.util.Scanner;

public class BOJ_C02_L21_1018 {
    public static void main(String[] args) {
        int n, m = 0;
        int chan = 64;
        char color = 'B';
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        char[][] board = new char[n][m];

        for(int i = 0; i < n; i++) {
            String tmp = sc.next();
            board[i] = tmp.toCharArray();
            //System.out.println(board[n-1][m-1]);
        }

        for(int a = 0; a <= n - 8; a++) {
            for (int b = 0; b <= m - 8; b++) {
                int count = 0;
                count = Math.min(checkColor(board, 'B', a, b), checkColor(board, 'W', a, b));
                if(count < chan)
                    chan = count;
            }
        }
        System.out.print(chan);
    }

    public static int checkColor(char[][] board, char c, int a, int b) {
        int count = 0;
        char color = c;
        for(int i = a; i < a + 8; i++) {
            for(int j = b; j < b + 8; j++) {
                if(color != board[i][j])
                    ++count;
                if(color == 'B')
                    color = 'W';
                else
                    color = 'B';
            }
            if(color == 'B')
                color = 'W';
            else
                color = 'B';
        }
        //System.out.println(count);
        return count;
    }
}