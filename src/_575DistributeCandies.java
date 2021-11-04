import java.util.HashSet;
import java.util.Set;

public class _575DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();
        int sum = candyType.length;
        for (int i = 0;i<sum;i++) {
            types.add(candyType[i]);
        }
        int num = sum/2;
        int allType = types.size();
        return Math.min(num, allType);
    }
}
