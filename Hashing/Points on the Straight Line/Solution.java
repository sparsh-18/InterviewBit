public class Solution {
	public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {

        if(a.size()==0 || b.size()==0||a==null || b==null || a.size()!=b.size()) return 0;
        else if(a.size()==1 && b.size() == 1) return 1;

        HashMap<Double, Integer> map = new HashMap<>();
        int max = 0;

        for(int i=0;i<a.size()-1;i++) {
            int px = a.get(i);
            int py = b.get(i);

            int dup= 1; //to add i th element too as well as any duplicate element

            for(int j=i+1; j<a.size(); j++) {
                int qx = a.get(j);
                int qy = b.get(j);

                double m = 0;

                if(px == qx) {
                    if(py==qy) { // Point 1 == Point 2 i.e. (5,5) == (5,5)
                        dup++;
                        continue;
                    } else { // slope 0
                        m = Double.MAX_VALUE;
                    }
                }

                else { // double might store -0
                    if(qy-py == 0) m=0;
                    else m = (double)(qy-py)/(qx-px);
                }

                if(map.containsKey(m)) {
                    map.put(m, map.get(m)+1);
                } else {
                    map.put(m,1);
                }
            }

            // finding maximum of all slopes
            for(int s: map.values()) {
                if(max<s+dup) max=s+dup;
            }

            if(max < dup) max = dup; // if all element same then nothing in map so max will be 0
            map.clear();
        }

        return max;
	}
}
