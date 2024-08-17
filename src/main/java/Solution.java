// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        int currentGap = 0;
        int largestGap = 0;

        // Finds first 1
        while ((N & 1) != 1) {
            N = N >> 1;
        }

        while (N > 0) {
            if ((N & 1) == 1) {
                largestGap = Math.max(currentGap, largestGap);
                currentGap = 0;
            } else {
                currentGap++;
            }
            N = N >> 1;
        }

        return largestGap;
    }
}
