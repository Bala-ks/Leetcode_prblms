class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        backtrack(res,new StringBuilder() ,n*2,new String[]{"(",")"});
        return res;
    }

    public void backtrack(List<String> res,StringBuilder temp,int n,String[] num){
        if(n == 0){
            if(isValid(temp)) res.add(temp.toString());
             return;
        }
        for(int i=0;i<2;i++){
            temp.append(num[i]);
            backtrack(res,temp,n-1,num);
            temp.deleteCharAt(temp.length() - 1);
        }
    }



    public boolean isValid(StringBuilder s) {
        Stack<Character> st = new Stack<>();
        for(char ch: s.toString().toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if(top == '(' && ch != ')'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}