class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int prev=0;
        int ans=0; // 2
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int cur=map.get(ch);
            if(i!=s.length()-1){
              if(cur>=prev){
                ans+=cur;
              }else{
                ans=ans-cur;
              }
            }else{
                ans+=cur;
            }
           prev=cur; // 1 
        } 
        return ans;
    }
}
