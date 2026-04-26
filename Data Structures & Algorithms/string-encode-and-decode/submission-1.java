class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String str: strs) {
            sizes.add(str.length());
        }
        for (int size: sizes) {
            res.append(size).append(',');
        }
        res.append("#");
        for(String str: strs){
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0){
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        int i = 0;

        while(str.charAt(i) != '#'){
            // A string-size can be in 2, 3 or more digits so we 
            // need to manually parse them and then add to sizes array
           StringBuilder cur = new StringBuilder(); 
           while(str.charAt(i) != ',') {
            cur.append(str.charAt(i));
            i++;
           }
           sizes.add(Integer.parseInt(cur.toString()));
           i++;
        }
        // Based on the decoded sizes, the rest of the strings are 
        // determined as substrings
        i++;
        for (int sz: sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}
