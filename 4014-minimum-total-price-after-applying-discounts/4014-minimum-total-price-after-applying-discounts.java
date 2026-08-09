class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int n = prices.length;
        int j = discounts.length;
        double sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (j != 0) {
                j--;
                int p = prices[i];
                int d = discounts[j];
                sum = sum + ((p * (100 - d)) / 100.0);
            } else {
                sum = sum + prices[i];
            }
        }
        return sum;
    }
}