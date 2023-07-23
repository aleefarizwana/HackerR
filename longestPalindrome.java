class Solution {
    public String longestPalindrome(String s) {
        int start=0,end=0;
        int len;
        for(int i=0;i<s.length();i++)
        {
            
            int oddSubstringLength  =palin(s,i,i);        // moving from center to the end of string ,i is midpoint
            int evenSubstringLength =palin(s,i,i+1);       //midpoint same when str is of even length
            /*Length of substring, if even length palindrome found it will store its length and vice versa, whichever is  greater */
            len = Math.max(oddSubstringLength,evenSubstringLength);   
            
            /*If a new substring is found or found with greater length,we need to find its start and end positions in order to return the string*/
            //Substring length formula if indices are given = end-start+1
            if(len>end-start+1)
            {
                                       //Even len (6)-> 2    start --> i-2, end -> i+3
                                       //Odd len (5) -> 2    start i-2, end -> i+2
                start = i-(len-1)/2;
                end=i+len/2;
            }
        }    
            return s.substring(start,end+1);               //+1 coz of java substring syntax
    }
        
    /*This function will keep on searching in both left & right directions for a character that matches in both left and right of centre */
    int palin(String s, int left, int right)
    {
        while(s.charAt(left)==s.charAt(right) && left>=0 && right<s.length())
        {
            left--;
            right++;
        }
        int len = right-left-1;               //gives length of found palindromic string
                                              //-1 coz the indices will be shifted one step ahead in the loop
        return len;
    }
               
    }
