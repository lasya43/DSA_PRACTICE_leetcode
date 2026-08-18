class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashSet<Integer>hs=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
            hs.add(nums[i]);
            }
            else if(hs.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}