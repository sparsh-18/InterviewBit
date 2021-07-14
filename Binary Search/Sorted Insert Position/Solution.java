public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
        int min = 0, max = a.size() - 1;

        while(min <= max) {
            int mid = (min+max)/2;

            if(a.get(mid) == b) return mid;

            else if(a.get(mid) < b) {
              
                min = mid+1;
            }

            else {
               
                max = mid-1;
            }
        }

        return max+1;
	}
}
