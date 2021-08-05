public class Solution {
    public int divide(int A, int B) {
        long dividend = A<0 ? A*-1L : A, divisor = B<0 ? B*-1L : B; // math abs does not work for large values

        // interviewbit edge cases
        if(A==Integer.MIN_VALUE && B==-1) return Integer.MAX_VALUE;
        if(A==Integer.MIN_VALUE && B==1) return Integer.MIN_VALUE;

        boolean sign = (A<0 ^ B<0) ? false : true;  // xor to check if both are negative or one of them

        long quotient = 0; 
        long temp = 0;

        for(int i=31; i>=0; i--) {
            if (temp + (divisor << i) <= dividend) {
                temp = temp + (divisor << i);
                quotient |=  1L << i;
            }
        }

        if(!sign) quotient=quotient*-1;

        return (int)quotient;
    }
}
