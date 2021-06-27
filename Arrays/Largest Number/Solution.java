public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
	    List<String> strs = new ArrayList<String>();
	    for(Integer i : a){
	        strs.add(String.valueOf(i));
	    }
	    
	    Collections.sort(strs, new MyCompartor());
	    
	     StringBuffer strBuf = new StringBuffer();
	    for(String s : strs){
	        if("0".equals(s) && strBuf.length() != 0) {
	            continue;   
	        }
	        strBuf.append(s);
	    }

	    return strBuf.toString();
	}
	
	
}

class MyCompartor implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){  //  3    30
        String first = s1 + s2;   // 3 30
        String second = s2 + s1;  // 30 3
        return first.compareTo(second) > 0 ? -1 : 1;
    }
}
