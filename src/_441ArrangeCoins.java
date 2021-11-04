public class _441ArrangeCoins {

    public int arrangeCoins(int n) {
        int sum = 0;
        int currentRow = 0;
        while (sum < n) {
            if (n-sum > currentRow) {
                currentRow+=1;
                sum+=currentRow;
            } else {
                break;
            }
        }
        return currentRow;
    }

}
