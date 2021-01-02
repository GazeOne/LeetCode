public class _605CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int prePosition = -1;
        int curPosition = -1;
        int canPlaceFlowersNums = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                if (prePosition == -1 && curPosition == -1) {
                    prePosition = i;
                    curPosition = i;
                    canPlaceFlowersNums += calPosition(0, curPosition, true);
                    if (canPlaceFlowersNums >= n) return true;

                } else {
                    curPosition = i;
                    canPlaceFlowersNums += calPosition(prePosition, curPosition, false);
                    prePosition = i;
                    if (canPlaceFlowersNums >= n) return true;
                }
            }
        }
        if (curPosition < flowerbed.length - 1) {
            if (curPosition == -1) {
                canPlaceFlowersNums += flowerbed.length % 2 == 0 ? (flowerbed.length / 2) : (flowerbed.length / 2 + 1);
                if (canPlaceFlowersNums >= n) return true;
                else return false;
            }
            canPlaceFlowersNums += (flowerbed.length - 1 - curPosition) / 2;
            if (canPlaceFlowersNums >= n) return true;
        }
        return false;
    }

    private int calPosition(int i, int curPosition, boolean start) {
        if (start) {
            if (curPosition == 0) return 0;
            return (curPosition - 1) % 2 == 0 ? (curPosition - 1) / 2 : (curPosition - 1) / 2 + 1;
        } else {
            if (curPosition - i >= 3) {
                return (curPosition - 3 - i) % 2 == 0 ? (curPosition - 3 - i) / 2 : (curPosition - 3 - i) / 2 + 1;
            }
            return 0;
        }
    }

}
