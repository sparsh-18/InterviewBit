public class Solution {
    public int uniquePaths(int A, int B) {
        return calc(0,0,A,B);
    }

    int calc(int x, int y, int A, int B) {
        int c=0;
        if(x==A-1 && y==B-1) {
            return 1;
        }

        if(x<A-1) {
            c = c + calc(x+1,y,A,B);
        }

        if(y<B-1) {
            c = c + calc(x,y+1,A,B);
        }


        return c;
    }
}

/*
    This can also be solved by using PnC approach

    suppose a grid of 2,4
    
    from 0 it is 1,3
    
    length of path 2-1 + 4-1 = 4
    
    total path is 4C1 = 4
*/
