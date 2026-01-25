class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int arr[]= nums.clone();
        ArrayList<Integer> list= new ArrayList<>();

        for(int val: nums){
            if(val>=0){
                list.add(val);
            }
        }
        int size=list.size();
        if(size==0){
            return nums;
        }
        k=k%size;
    

        ArrayList<Integer> rot=new ArrayList<>();

        for(int i=k; i<size; i++){
            rot.add(list.get(i));
        }
        for(int i=0; i<k; i++){
            rot.add(list.get(i));
        }
        int idx=0;

        for(int i=0; i< nums.length; i++){
            if(nums[i]>=0){
                nums[i]=rot.get(idx++);
            }
        }
        return nums;
    }
}