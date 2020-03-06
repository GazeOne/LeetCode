public class _26RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int distinctNum = 0;
        int currentNum = nums[0];
        for(int i = 0; i<nums.length ;){
            if(nums[i]!=currentNum){
                distinctNum++;
                nums[distinctNum] = nums[i];
                currentNum = nums[i];
                i = i+1;
            }else{
                i++;
            }
        }
        return distinctNum+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        removeDuplicates(nums);
    }

}
