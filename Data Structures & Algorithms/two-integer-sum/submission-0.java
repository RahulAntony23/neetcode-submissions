class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int[] pair = new int[2];

        for ( int i =0 ; i < nums.length ; i++){
            int comp = target - nums[i];
            if (map.containsKey(comp)){
                pair[0]=map.get(comp);
                pair[1]=i;
            }

            else{
                map.put(nums[i],i);
            }
        }

        return pair;
        
    }
}
