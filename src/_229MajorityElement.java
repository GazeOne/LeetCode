import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _229MajorityElement {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int length = nums.length/3;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int key: map.keySet()) {
            if (map.get(key) >= length) {
                result.add(key);
            }
        }

        return result;
    }

}
