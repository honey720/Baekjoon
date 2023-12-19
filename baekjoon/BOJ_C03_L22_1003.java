import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class BOJ_C03_L22_1003 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        HashMap<Integer, ArrayList<Integer>> dp = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());

            for(int j = 0; j <= input; j++) {
                ArrayList<Integer> al = new ArrayList<>();
                if(j == 0) {
                    al.add(1);
                    al.add(0);
                }
                else if(j == 1) {
                    al.add(0);
                    al.add(1);
                }
                else {
                    al.add(dp.get(j - 1).get(0) + dp.get(j - 2).get(0));
                    al.add(dp.get(j - 1).get(1) + dp.get(j - 2).get(1));
                }
                dp.put(j, al);
            }

            st.append(dp.get(input).get(0)).append(" ").append(dp.get(input).get(1)).append("\n");
        }
        System.out.print(st);
        br.close();
    }

}
