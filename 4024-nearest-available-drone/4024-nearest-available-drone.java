class Solution {
    public int nearestDrone(int[][] drones, int[] t) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        
        for (int i = 0; i < drones.length; i++) {
            int a = drones[i][0];
            int b = drones[i][1];
            int dist = Math.abs(a - t[0]) + Math.abs(b - t[1]);
            if (dist <= drones[i][2] && dist < min) {
                index = i;
                min = dist;
            }
        }
        return index;
    }
}