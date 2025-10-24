class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String arr[]=s.split("\\s+");
        String last=arr[arr.length-1];
        return last.length();
    }
}

import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        String LW=arr[arr.length-1];
        int count=0;
        for(int i=0;i<LW.length();i++){
            // if valid character founds then only increment kro
            // calculating length directly will also leads to calculate space thats why 
            char curr=LW.charAt(i);
                count++;
            }
        return count;
    }
}
