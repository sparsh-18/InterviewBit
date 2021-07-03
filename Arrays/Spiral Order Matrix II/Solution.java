public class Solution {
    public int[][] generateMatrix(int A) {
        int c = 1, d = 1, row = 0;
        
        int arr[][] = new int[A][A];

        while (row<A &&  c <= A*A) {
            if (d == 1) {
                for (int i = row; i < A-1-row; i++) {
                    arr[row][i] = c++;
                }
                d=2;
            }
            if (d == 2) {
                for (int j = row; j <= A-2-row; j++) {
                    arr[j][A-1-row] = c++;
                }
                d=3;
            }
            if (d == 3) {
                for (int i = A-1-row; i>row; i--) {
                    arr[A-1-row][i] = c++;
                }
                d=4;
            }
            if (d == 4) {
                for (int j = A-1-row; j>row; j--) {
                    arr[j][row] = c++;
                }
                d=1;
            }
            row++;
        }
        if (A%2 !=0){
            arr[A/2][A/2] = c++;
        }
        return arr;
    }
}
