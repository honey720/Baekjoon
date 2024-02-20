import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_C04_L30_9251 {
    static char[] str1, str2;
    static int[][] dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str1 = br.readLine().toCharArray();
        str2 = br.readLine().toCharArray();
        dp = new int[str1.length+1][str2.length+1];
        for(int x = 1; x <= str1.length; x++) {
            for(int y = 1; y <= str2.length; y++) {
                if(str1[x-1] == str2[y-1]) {
                    dp[x][y] = dp[x-1][y-1] + 1;
                }
                else {
                    dp[x][y] = Math.max(dp[x-1][y], dp[x][y-1]);
                }
            }
        }
        System.out.println(dp[str1.length][str2.length]);
    }

}
