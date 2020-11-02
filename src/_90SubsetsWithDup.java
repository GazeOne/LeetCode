import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _90SubsetsWithDup {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> temp = deepClone(result);
            for (int j = 0; j < temp.size(); j++) {
                temp.get(j).add(nums[i]);
            }
            result.addAll(temp);
        }
        return  distinct(result);
    }

    private List<List<Integer>> distinct(List<List<Integer>> result) {
        List<List<Integer>> fs = new ArrayList<>();
        for (int i=0;i<result.size();i++) {
            List<Integer> item1 = result.get(i);
            boolean isExsits = false;
            for (int j = i+1;j<result.size();j++){
                List<Integer> item2 = result.get(j);
                if (!isEquals(item1,item2)) {
                    isExsits = false;
                } else {
                    isExsits = true;
                    break;
                }
            }
            if (!isExsits) {
                fs.add(item1);
            }
        }
        return fs;
    }

    private boolean isEquals(List<Integer> item1, List<Integer> item2) {

        int m = item1.size();
        int n = item2.size();
        if (n!=m) return  false;

        for (int i =0;i<m;i++){
            if (item1.get(i).intValue()!=item2.get(i).intValue()){
                return false;
            }
        }

        return true;
    }

    private List<List<Integer>> deepClone(List<List<Integer>> result) {
        List<List<Integer>> temp = new ArrayList<>();
        for (int i = 0;i<result.size();i++) {
            List<Integer> item = result.get(i);
            List<Integer> tempItem = new ArrayList<>();
            for (int j = 0;j<item.size();j++){
                tempItem.add(item.get(j).intValue());
            }
            temp.add(tempItem);
        }

        return temp;
    }

}
