import java.util.*;

public class _349Intersection {

    public static int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> nums1Diff = new HashMap<>();
        for (int i = 0; i <nums1.length; i++) {
            nums1Diff.put(nums1[i], 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (nums1Diff.get(nums2[i])!=null){
                result.add(nums2[i]);
                nums1Diff.remove(nums2[i],1);
            }
        }

        int[] fs = new int[result.size()];
        for (int i=0;i<result.size();i++){
            fs[i]=result.get(i);
        }
        return fs;
    }

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1() {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        intersection(nums1,nums2);
    }

}
