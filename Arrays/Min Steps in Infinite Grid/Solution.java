public class Solution {
    public int coverPoints(int[] A, int[] B) {
        int c = 0;
        int x = A[0], y = B[0];
        for(int i = 1; i< A.length; i++) {
            int d1 = Math.abs(A[i] - x);
            int d2 = Math.abs(B[i] - y);
            c+=Math.max(d1,d2);
            x=A[i];
            y=B[i];
        }
        return c;
    }
}
