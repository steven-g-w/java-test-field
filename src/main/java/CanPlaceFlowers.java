public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n <= 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            boolean leftOk = i == 0 || flowerbed[i-1] == 0;
            boolean rightOK = i == flowerbed.length - 1 || flowerbed[i+1] == 0;
            if (flowerbed[i] == 0 && leftOk && rightOK) {
                flowerbed[i] = 1;
                n--;
                if (n <= 0) {
                    return true;
                }
            }

        }

        return n <= 0;
    }
}
