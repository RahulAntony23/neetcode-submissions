class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map: Fingerprint String -> List of Anagram Words
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. Create the frequency counter (our 26-slot scoreboard)
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++; 
            }
            
            // 2. Convert the integer array into a String to use as a Hash Map Key
            // e.g., [1, 0, 0, ..., 1, ...] becomes exactly that as a string format
            String key = Arrays.toString(count);

            // 3. If this fingerprint isn't in the map yet, create an empty list for it
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            // 4. Drop the original word into its rightful bucket
            map.get(key).add(s);
        }

        // Return all the grouped lists packed together
        return new ArrayList<>(map.values());
    }
}