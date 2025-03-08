class Solution {
    // Method to find the minimum number of recolors needed to get at least k consecutive black blocks
    public int minimumRecolors(String blocks, int k) {
       //take white count of first window of size k
        int wCount = 0;
        for (int i = 0; i < k; ++i) {
            if (blocks.charAt(i) == 'W') {
                wCount++;
            }
        }

        // Count of white blocks in the first window
        int minResult = wCount;
      
        // Slide the window of size k across the string and update the minimum recolors requird
        for (int i = k; i < blocks.length(); ++i) {
            // If  character is white increment white count
            if (blocks.charAt(i) == 'W') {
                wCount++;
            }
            // If exiting character is white decrement white count
            if (blocks.charAt(i - k) == 'W') {
                wCount--;
            }
            // Update the minimum recolors if the current count is less than the previous minimum
            minResult = Math.min(minResult, wCount);
        }

        // Return the minimum number of recolors required
        return minResult;
    }
}