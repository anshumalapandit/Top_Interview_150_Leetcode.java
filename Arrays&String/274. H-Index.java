class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int arr[]=new int[n+1];
        for(int c:citations){
            if(c>n){
                // if current value is > then citations length then store at last pos
                arr[n]++;
            }else{
                // if it is smaller then uske hi idx pe store kro count
                arr[c]++;
            }
        }
        // now calculate citations of each person
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
           count=count+arr[i];
           if(count>=i){
            // if kisi point cititaions ka count jitna paper hai utna ya usse jyada ho jayega
            return i;
           }
        }
        return 0; // no matter write any integer
    }
}
