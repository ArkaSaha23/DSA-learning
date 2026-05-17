//use STACT data structure
//for { , [ , ( push into the stack 
//by iterating through the loop if we get each character and check if that character is ),},] and compare them with
// the top of the stack...if it is then pop....

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')        //for opening
            {          
                stack.push(ch);
            }
            else                                        //for closing
            {
                if(stack.isEmpty())                     //if the stack is empty but there are some extra closing brackets in staring
                {
                    return false;
                }
                //compare the character of the top of stack with currant character
                //if matches then pop the character rom stack otherwise return false
                if(stack.peek()=='(' && ch==')' || 
                stack.peek()=='{' && ch=='}' || 
                stack.peek()=='[' && ch==']')
                {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return (stack.isEmpty());//for more opening bracket than closing
    }
}
