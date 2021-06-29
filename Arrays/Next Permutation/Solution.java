public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        boolean found=false;
        int indexOfSmall = -1;
        for(int i=A.size()-1; i>0; i--) {
            if(A.get(i-1)<A.get(i)){
                indexOfSmall = i-1;
                found = true;
                break;
            }
        }
        if(!found){
            Collections.sort(A);
        }
        else {
            for(int i=A.size()-1; i>0; i--) {
                if(A.get(i) > A.get(indexOfSmall)){
                    swap(A,i,indexOfSmall);
                    reverse(A,indexOfSmall+1);
                    break;
                }
            }
        }
        return A;
    }
    public void swap(ArrayList<Integer> A, int i, int j) {
        int t = A.get(i);
        A.set(i,A.get(j));
        A.set(j, t);
    }
    public void reverse(ArrayList<Integer> A, int s) {
        int e = A.size()-1;

        while(s<e) {
            swap(A,s,e);
            s++;
            e--;
        }
    }
}

// for explanation
// https://leetcode.com/problems/next-permutation/solution/
