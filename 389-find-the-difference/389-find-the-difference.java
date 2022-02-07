class Solution {
    public char findTheDifference(String s, String t) {
        char[] str1 = s.toCharArray();
        Arrays.sort(str1);
        
        char[] str2 = t.toCharArray();
        Arrays.sort(str2);
        
        for(int i=0; i<s.length(); i++)
        {
            if(str1[i]!=str2[i])
                return str2[i];
        }
        
        return str2[t.length()-1];
    }
}