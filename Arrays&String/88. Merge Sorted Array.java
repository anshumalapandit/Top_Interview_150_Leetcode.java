class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int idx=0;
        List<Integer> arr=new ArrayList<>();
        for(int id=0;id<m;id++){
                arr.add(nums1[id]);
        }
        while(i<arr.size() && j<n){
            if(arr.get(i)<nums2[j]){
                nums1[idx++]=arr.get(i);
                i++;
            }else{
                nums1[idx++]=nums2[j++];
            }
        }
    // add remaining ele of num1
    while(i<arr.size()){
        nums1[idx++]=arr.get(i);
        i++;
    }
    while(j<n){
        nums1[idx++]=nums2[j++];
    }
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
    //nums1’s values are already in nums1 Only nums2's values need to be copied
    // copied remaining element of num2 only 
    while(j>=0){
        nums1[k--]=nums2[j--];
    }
    }
}
