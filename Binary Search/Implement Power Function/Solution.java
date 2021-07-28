public class Solution {
	public int pow(int x, int y, int d) {
        if(x==0) return 0;
        if(y==0) return 1;

        long temp = (long)pow(x,y/2,d);

        if(y%2==0) return temp*temp >=0 ? (int)(temp%d*temp%d) : (int)((d+temp%d*temp%d)%d);
        else return temp*temp*x >= 0 ? (int)(temp%d*temp%d*x % d) : (int)((d+temp%d*temp%d*x)%d);
	}
}
