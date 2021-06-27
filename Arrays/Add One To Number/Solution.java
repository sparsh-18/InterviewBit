public class Solution {
    public int[] plusOne(int[] A) {
        int l = A.length;
        int head = 0;

        while(head<A.length && A[head] == 0) {
            l--;
            head++;
        }

        if(l <= 0) {
            int B[] = {1};
            return B;
        }

        int f = 0;
        for ( int e: A) {
            if(e < 9) {
                f=1;
                break;
            }
        }
        if(f==0) l++;
        int B[] = new int[l];

        int c = l-1;
        int carry = 0;

        int d = A[A.length-1] + 1;
        
        if(d>9) carry = 1;

        B[c--] = d%10;

        for(int i = A.length-2; i>=head; i--) {
            d = A[i];
            if(carry == 1) {
                d++;
                carry = 0;
            }

            if(d>9) carry =1;

            B[c--] = d%10;
            
        }

        if (carry == 1) B[0] = 1;

        return B;

    }
}
