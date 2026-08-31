class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            boolean dest = false;
            while (!s.isEmpty() && s.peek() > 0 && a[i] < 0) {
                if (Math.abs(a[i]) > s.peek()) {
                    s.pop();
                } else if (Math.abs(a[i]) == s.peek()) {
                    dest = true;
                    s.pop();
                    break;
                } else {
                    dest = true;
                    break;
                }
            }
            if (dest == false) {
                s.push(a[i]);
            }
        }
        int[] result = new int[s.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = s.pop();
        }
        return result;
    }
}