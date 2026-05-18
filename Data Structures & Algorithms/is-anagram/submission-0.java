class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> store = new HashMap<>();

        // Create the entire hashmap
        for (char key: s.toCharArray()){
            store.put(key, store.getOrDefault(key, 0) + 1);
        }
        // Start subtracting away
        for(char key: t.toCharArray()){
            if(store.containsKey(key)){
                int count = store.get(key) - 1;
                if (count >= 0){
                    store.put(key, count);
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
}
