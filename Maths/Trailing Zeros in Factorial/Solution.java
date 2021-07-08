public class Solution {
    public int trailingZeroes(int A) {
        int r,p=1,c=0;
    
        do {
            p*=5;
            r = A/p;
            c+=r;
        }while(r>0);

        return c;
    }
}
 /**
  How many multiples of 5 are there in the numbers from 1 to 100?

  Because 100 ÷ 5 = 20, so, there are twenty multiples of 5 between 1 and 100.

  But wait, actually 25 is 5×5, so each multiple of 25 has an extra factor of 5, e.g. 25 × 4 = 100，which introduces an extra of zero.

  So, we need to know how many multiples of 25 are there between 1 and 100? Since 100 ÷ 25 = 4, there are four multiples of 25 between 1 and 100.

  Finally, we get 20 + 4 = 24 trailing zeroes in 100!
 
 */
