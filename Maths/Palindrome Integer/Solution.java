public class Solution {
    public int isPalindrome(int A) {
        // with calculating remainder
        // int lenA = 0, t=A , rem=0;
        // while(t!=0) {
        //     rem = rem*10 + t%10;
        //     t/=10;
        //     lenA++;
        // }

        // if(A<0) return 0;

        // if(lenA == 1) return 1;

        // if(rem==A) return 1;
        // return 0;

        int lenA = 0, t=A;
        while(t!=0) {
            t/=10;
            lenA++;
        }
        if(A<0 ) return 0;
        if(lenA == 1) return 1;

        while(lenA/2 > 0) {
            int f = (A/ (int)Math.pow(10, lenA-1))%10;
            int l = A%10;

            if(f!=l) return 0;

            A/=10;
            lenA-=2;
        } 
        return 1;
    }
}
