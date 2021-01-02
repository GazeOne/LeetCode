public class _746MinCostClimbingStairs {

    //minCost = minCost(i - 1)+cost[i-1], minCost(i-2)+cost[i-2]
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev = 0, curr = 0;
        for (int i = 2; i <= n; i++) {
            int next = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = next;
        }
        return curr;

    }

}
