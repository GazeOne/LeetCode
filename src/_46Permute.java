import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _46Permute {

    public List<List<Integer>> permute(int[] nums) {

        return allA(nums, 0);
    }

    public List<List<Integer>> allA(int[] nums, int start) {

        List<List<Integer>> result = new LinkedList<>();

        if (nums.length - start == 1) {
            List<Integer> temp = new LinkedList<>();
            temp.add(nums[start]);
            result.add(temp);
            return result;
        }

        List<List<Integer>> current = allA(nums, start + 1);

        for (int i = 0; i < current.size(); i++) {
            List<Integer> temp = current.get(i);
            for (int j = 0; j <= temp.size(); j++) {
                List<Integer> newData = new LinkedList<>(temp);
                newData.add(j, nums[start]);
                result.add(newData);
            }
        }
        return result;
    }
}
