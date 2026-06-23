class Solution {
    public void reverseString(char[] s) {
      int begin=0;
      int end=s.length-1;

      while(begin<end){
        char temp=s[end];
        s[end]=s[begin];
        s[begin]=temp;
        begin++;
        end--;
      }  
    }
}