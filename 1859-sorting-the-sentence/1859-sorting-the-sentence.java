class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" "); //convert sentence to array
        String[] res = new String[arr.length];
        
        for(int i=0; i<arr.length; i++)
        {
            //get the last character from each word as an integer
            int index = (int)(arr[i].charAt(arr[i].length()-1))-48;
            
            StringBuilder sb = new StringBuilder(arr[i]);
            //delete last character after converting string to stringBuiulder
            sb.deleteCharAt(arr[i].length() - 1);
            res[index-1] = sb.toString();
        }
        
        StringBuilder result = new StringBuilder();
        for(int i=0; i<arr.length; i++)
        {
            result.append(res[i]);
            // if it's not last word, then don't add extra space
            if(i<arr.length-1)
                result.append(" ");
        }
        return result.toString();
    }
}