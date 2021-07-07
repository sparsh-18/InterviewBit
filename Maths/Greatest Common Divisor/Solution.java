public class Solution {
    public int gcd(int A, int B) {
        int ans = calcGcd(Math.max(A,B), Math.min(A,B));
        return ans;
    }

    public int calcGcd(int divident, int divisor) {
        if(divisor == 0 ) return divident;
        int rem = divident%divisor;
        if(rem == 0) return divisor;

        else
            return calcGcd(divisor,rem);
    }
}
