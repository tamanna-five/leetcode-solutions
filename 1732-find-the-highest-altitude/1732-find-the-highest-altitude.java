class Solution {
    public int largestAltitude(int[] gain) {
      int maxaltitude=0;
      int current=0;

      for(int i:gain){
        current=current+i;
        maxaltitude=Math.max(maxaltitude,current);
      }
      return maxaltitude;  
    }
}