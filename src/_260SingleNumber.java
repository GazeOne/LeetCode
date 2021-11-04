import java.util.HashMap;
import java.util.Map;

public class _260SingleNumber {

    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int cur = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                result[cur] = key;
                cur++;
            }
        }
        return result;
    }

}
