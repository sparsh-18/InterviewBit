public class Solution {
    public int sqrt(int A) {
        long min = 0, max = A/2;

        if(A==1 || A==0) return A;

        while(min <= max) {
            long mid = (min+max)/2;

            if(mid*mid == A) return (int)mid;

            else if(mid*mid < A) min = mid+1; 

            else max = mid-1;
        }

        return (int)max;
    }
}
