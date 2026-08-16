class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int r = drones.length;
        int c = 3;
        int x = target[0];
        int y = target[1];
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < r; i++) {
            int a = drones[i][0];
            int b = drones[i][1];
            int dist = Math.abs(a - x) + Math.abs(b - y);
            if (dist <= drones[i][2]) {
                if (dist < min) {
                    index = i;
                    min = dist;
                }
            }
        }
        return index;
    }
}