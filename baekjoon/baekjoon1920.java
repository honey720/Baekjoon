import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, m;

        n= Integer.parseInt(st.nextToken());
        int[] A = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            A[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(A);

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < m; j++) {
            boolean result = false;
            int left = 0;
            int right = n - 1;
            int mid = 0;
            int B = Integer.parseInt(st.nextToken());
            while (left <= right) {
                mid = (left + right) / 2;
                if(B < A[mid]) {
                    right = mid - 1;
                }
                else if(B > A[mid]) {
                    left = mid + 1;
                }
                else {
                    result = true;
                    break;
                }
            }
            if(result){
                bw.write("1");
                bw.write("\n");
            }
            else{
                bw.write("0");
                bw.write("\n");
            }
        }
        br.close();
        bw.close();
    }
}