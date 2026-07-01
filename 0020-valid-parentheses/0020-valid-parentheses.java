class Solution {
    public boolean isValid(String s) {
     Stack <Character> st = new Stack<>();
     char [] ch = s.toCharArray();
     for(char d: ch){
        if(d == '('){
            st.push(')');
        }
        else if(d == '{'){
            st.push('}');
        }
        else if(d == '['){
            st.push(']');
        }
        else{
            if(st.isEmpty() || st.pop() != d){
                return false;
            }
        }
     }
     return st.isEmpty();
    }

    }