import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class baekjoon1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        HashMap<Integer,String> word = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int min, minIndex;

        for(int i = 0; i < N; i++) {
            String w = br.readLine();
            if(word.containsValue(w))
                continue;
            word.put(count, w);
            ++count;
        }

        List<String> valueList = new ArrayList<>(word.values());
        valueList.sort(String::compareTo);

        List<String> outputList = new ArrayList<>();

        while(valueList.size() != 0){
            min = valueList.get(0).length();
            minIndex = 0;
            for(int i = 0; i < valueList.size(); i++) {
                if(min > valueList.get(i).length()) {
                    min = valueList.get(i).length();
                    minIndex = i;
                }
                else
                    continue;
            }
            outputList.add(valueList.get(minIndex));
            valueList.remove(minIndex);
        }

        for(String value : outputList) {
            System.out.println(value);
        }
    }
}