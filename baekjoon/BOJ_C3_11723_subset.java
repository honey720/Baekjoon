import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_C3_11723_subset {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        HashSet<Integer> hs = new HashSet<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int operand = 0;
            String input = br.readLine();
            st = new StringTokenizer(input);
            String operator = st.nextToken();
            if(st.hasMoreTokens()) {
                operand = Integer.parseInt(st.nextToken());
            }
            subset(hs, operator, operand, bw);
        }
        br.close();
        bw.close();
    }

    public static void subset(HashSet<Integer> hs, String operator, int operand, BufferedWriter bw) throws Exception {
        switch (operator) {
            case "add": {
                hs.add(operand);
                break;
            }
            case "remove": {
                hs.remove(operand);
                break;
            }
            case "check": {
                if(hs.contains(operand)) {
                    bw.write("1 \n");
                }
                else {
                    bw.write("0 \n");
                }
                break;
            }
            case "toggle": {
                if(!hs.contains(operand)) {
                    hs.add(operand);
                }
                else {
                    hs.remove(operand);
                }
                break;
            }
            case "all": {
                for(int i = 1; i <= 20; i++) {
                    hs.add(i);
                }
                break;
            }
            case "empty": {
                hs.clear();
                break;
            }
        }
    }
}
