// class Solution {

//     Stack<Integer> st, min;

//     Solution() {
//         st = new Stack<>();
//         min = new Stack<>();
//     }

//     public void push(int x) {
//         if(min.empty() || x < min.peek()) min.push(x);
//         st.push(x);
//     }

//     public void pop() {
//         if(!st.empty()) {
//             int t = st.peek();
//             if(t==min.peek()) min.pop();
//             st.pop();
//         }
//     }

//     public int top() {
//         return st.empty() ? -1 : st.peek();
//     }

//     public int getMin() {
//         return min.empty() ? -1 : min.peek();
//     }
// }
//------------------------------------------------------------------------------------------------

// with O(1) space
// using y = 2x - min,   min = 2x-y  approach

class Solution {

    Stack<Integer> st;
    int min;

    Solution() {
        st = new Stack<>();
        min=-1;
    }

    public void push(int x) {
        if(min == -1) min=x;
        
        if(x >= min) st.push(x);

        else if(x < min) {
            int t = 2*x-min;
            st.push(t);
            min = x;
        }
    }

    public void pop() {
       if(!st.empty()) {
           int t = st.peek();
           
           if(t<min) {
               min = 2*min - t;
           }

           st.pop();
           if(st.empty()) min=-1;
       }
    }

    public int top() {
        if(!st.empty()) {
           int t = st.peek();
           
           if(t<min) {
               return  min;
           } else
                return t;
        }
        else return -1;
    }

    public int getMin() {
        return min;
    }
}
