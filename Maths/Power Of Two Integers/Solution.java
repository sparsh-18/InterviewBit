public class Solution {
    public int isPower(int A) {
        /*
           i^p = A
           p = log A/ log i 
        */
        if(A==1) return 1;
        double logA = Math.log(A);

        for(int i=1;i<=Math.sqrt(A);i++) {
            double res = logA/Math.log(i);

            //if res is an integer
            // res = 3.0000000114
            // 3.000000114 - 3 = 0.000000114 < 0.000001
            if(res - (int)res < 0.000001){
                return 1;
            }
        }
        return 0;
    }
}
