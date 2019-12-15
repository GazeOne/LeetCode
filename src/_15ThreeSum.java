import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _15ThreeSum {

   /* 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

    注意：答案中不可以包含重复的三元组。

    例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

    满足要求的三元组集合为：
            [
            [-1, 0, 1],
            [-1, -1, 2]
            ]
    */

    public static List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> registerData = new HashMap<>();
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            registerData.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = 0 - nums[i] - nums[j];
                if (registerData.containsKey(temp) && registerData.get(temp) != i && registerData.get(temp) != j) {
                    if (distinct(results, nums[i], nums[j])) {
                        List<Integer> tuple = new ArrayList<>();
                        tuple.add(nums[i]);
                        tuple.add(nums[j]);
                        tuple.add(temp);
                        results.add(tuple);
                    }
                }
            }
        }
        return results;
    }

    private static boolean distinct(List<List<Integer>> results, int num, int num1) {
        for(int i =0 ;i <results.size();i++){
            List<Integer> added =  results.get(i);
            if(added.contains(num) && added.contains(num1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for (List item : result) {
            System.out.println(item.get(0) + " ," + item.get(1) + " ," + item.get(2));
        }
    }

   /* public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len ; i++) {
            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }
*/
}
