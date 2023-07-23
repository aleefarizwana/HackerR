Question 7: Java Stack

Skill Mapping: Basic
Description: Solve the HackerRank Problem given as a link below - 

https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
            Stack<Character>st=new Stack<>();
            boolean res=true;
			String input=sc.next();
            for(int i=0;i<input.length();i++){
                if(input.charAt(i) == '{' || input.charAt(i)=='[' || input.charAt(i)=='('){
                    st.push(input.charAt(i));
                }
                else{
                    //stack must not be empty 
                    //top should be equal to new input =pop
                    if(!st.isEmpty() && st.peek()==reverse(input.charAt(i))){
                        st.pop();
                    }
                    else{
                        res=false;
                        break;
                    }
                }
            }
            if(st.isEmpty() && res){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
            }//Complete the code
		}
		
        
        static Character reverse(Character s){
            if(s=='}') {return '{';}
            if(s==']'){ return '[';}
            if(s==')'){ return '(';}
            return null;
	}
}

// Input (stdin)
// {}()
// ({()})
// {}(
// []
// Your Output (stdout)
// true
// true
// false
// true
// Expected Output
// true
// true
// false
// true

