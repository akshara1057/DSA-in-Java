class Solution {
    public int totalNumbers(int[] digits) {
        // Step 1: Count the frequency of each digit (0-9) available in the input array
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }

        int ans = 0;

        // Step 2: Iterate through all possible 3-digit even numbers
        for (int i = 100; i <= 998; i += 2) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int ones = i % 10;

            // Step 3: Count the digit requirements for the current number 'i'
            int[] currentCount = new int[10];
            currentCount[hundreds]++;
            currentCount[tens]++;
            currentCount[ones]++;

            // Step 4: Verify if we have enough digits to form this number
            if (currentCount[hundreds] <= count[hundreds] &&
                currentCount[tens] <= count[tens] &&
                currentCount[ones] <= count[ones]) {
                ans++;
            }
        }

        return ans;
    }
}
