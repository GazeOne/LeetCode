package interview150;

public class _55CanJump {

    public boolean canJump(int[] nums) {
        int maxDis = 0;
        for (int i = 0; i < nums.length; i++) {
            int dis = i + nums[i];
            if (dis > maxDis) {
                maxDis = dis;
            }
            if (maxDis >= nums.length) return true;
        }
        return false;
    }

}
