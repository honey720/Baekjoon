import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lv = Integer.parseInt(st.nextToken());
        String score = st.nextToken();
        if (score.equals("miss")) System.out.println(0);
        else if (score.equals("bad")) System.out.println(lv * 200);
        else if (score.equals("cool")) System.out.println(lv * 400);
        else if (score.equals("great")) System.out.println(lv * 600);
        else if (score.equals("perfect")) System.out.println(lv * 1000);
    }
}