class Solution {
    public boolean detectCapitalUse(String word) {
        
        int count=0;
        
        for(int i=0; i<word.length(); i++)
        {
            if((word.charAt(i)-'0')>=17 && (word.charAt(i)-'0')<=42)
                count++;
        }
        
        if(count==1 && ((word.charAt(0)-'0')>=17 && (word.charAt(0)-'0')<=42))
            return true;
        else if(count==word.length())
            return true;
        else if(count==0)
            return true;
        
        return false;
    }
}