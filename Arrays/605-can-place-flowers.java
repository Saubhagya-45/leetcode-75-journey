class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        int count = 0;

        // Handle single-element flowerbed
        if (m == 1) {
            if (flowerbed[0] == 0) return n <= 1;
            else return n == 0;
        }

        // Check first plot
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1; // plant flower
            count++;
        }

        // Check last plot
        if (flowerbed[m - 1] == 0 && flowerbed[m - 2] == 0) {
            flowerbed[m - 1] = 1; // plant flower
            count++;
        }

        // Check middle plots
        for (int i = 1; i < m - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1; // plant flower
                count++;
            }
        }

        // Return true if we can plant at least n flowers
        return count >= n;
    }
}
