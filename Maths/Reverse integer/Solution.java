public class Solution {
    public int reverse(int A) {
        
        int n=Math.abs(A);
        // used t as long because on reversing if t crosses int value then garbage value is assigned
        long t=0;
 
        while(n>0) {
            int d = n%10;
            t=t*10+d;
            n/=10;
        }

        if(t < Integer.MIN_VALUE || t > Integer.MAX_VALUE) return 0;
        
        if(A<0) t=t*-1;

        return (int)t;
    }
}
