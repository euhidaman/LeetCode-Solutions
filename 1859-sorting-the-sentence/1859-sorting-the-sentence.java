class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String[] res = new String[arr.length];
        
        for(int i=0; i<arr.length; i++)
        {
            int index = (int)(arr[i].charAt(arr[i].length()-1))-48;
            
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.deleteCharAt(arr[i].length() - 1);
            res[index-1] = sb.toString();
        }
        
        StringBuilder result = new StringBuilder();
        for(int i=0; i<arr.length; i++)
        {
            result.append(res[i]);
            if(i<arr.length-1)
                result.append(" ");
        }
        return result.toString();
    }
}