import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_C04_L24_1991 {

    static HashMap<String, String[]> tree = new HashMap<>();
    static String preans = "", inans = "", postans = "";

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String node, left, right;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            node = st.nextToken();
            left = st.nextToken();
            right = st.nextToken();
            tree.put(node, new String[] {left, right});
        }
        pretrav("A");
        intrav("A");
        posttrav("A");
        System.out.println(preans);
        System.out.println(inans);
        System.out.println(postans);
    }

    public static void pretrav(String node) {
        String[] output = tree.get(node);
        preans += node;
        if(!output[0].equals("."))
            pretrav(output[0]);
        if(!output[1].equals("."))
            pretrav(output[1]);
    }
    public static void intrav(String node) {
        String[] output = tree.get(node);
        if(!output[0].equals("."))
            intrav(output[0]);
        inans += node;
        if(!output[1].equals("."))
            intrav(output[1]);
    }
    public static void posttrav(String node) {
        String[] output = tree.get(node);
        if(!output[0].equals("."))
            posttrav(output[0]);
        if(!output[1].equals("."))
            posttrav(output[1]);
        postans += node;
    }
}
