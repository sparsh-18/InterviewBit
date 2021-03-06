public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> a, int b) {
        Collections.sort(a);
        
        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(a.size() < 4)
            return result;
        for(int i = 0; i < a.size(); i++){
            for(int j = i+1; j < a.size(); j++){
                int k =j+1;
                int l = a.size()-1;
                
                while(k < l){
                    int sum = a.get(i) +a.get(j) + a.get(k) + a.get(l);
                    if(sum > b){
                        l--;
                    }
                    else if(sum < b){
                        k++;
                    }
                    else if(sum == b){
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(a.get(i));
                        list.add(a.get(j));
                        list.add(a.get(k));
                        list.add(a.get(l));   
                        if(!set.contains(list)){
                            set.add(list);
                            result.add(list);
                        }
                        k++;
                        l--;
                    }
                    
                }
            }
        }
        return result;


    }

}

