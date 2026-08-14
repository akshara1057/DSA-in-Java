class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int f = 0;
        int l = m * n - 1;
        ;
        while (f <= l) {
            int mid = (f + l) / 2;
            int r = mid / m;
            int c = mid % m;
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] < target) {
                f = mid + 1;
            } else {
                l = mid - 1;
            }
        }
        return false;
    }
}