import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[Integer.parseInt(br.readLine())];
        int count = 0;
        while(count < arr.length) {
            arr[count] = Integer.parseInt(br.readLine());
            count++;
        }
        Arrays.sort(arr);
        for(int i : arr)
            sb.append(i + "\n");
        System.out.println(sb);
    }
}