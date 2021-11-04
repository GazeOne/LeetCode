import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _187FindRepeatedDnaSequences {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        int length = s.length() - 10;
        for (int i = 0; i<=length; i++) {
            String temp = s.substring(i, i + 10);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            if (map.get(temp) == 2) {
                result.add(temp);
            }
        }
        return result;
    }

}
