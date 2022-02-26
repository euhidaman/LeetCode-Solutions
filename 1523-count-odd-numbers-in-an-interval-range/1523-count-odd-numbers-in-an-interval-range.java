class Solution {
    public int countOdds(int low, int high) {
        int oddHigh = (high+1)/2;
        int oddLow = low/2;
        return oddHigh-oddLow;
    }
}