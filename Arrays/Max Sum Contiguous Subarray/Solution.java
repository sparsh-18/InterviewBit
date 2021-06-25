public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int max = A[0];
        int sum = 0;
        for(int el: A) {
            sum+=el;
            if (sum > max) 
                max = sum;

            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
