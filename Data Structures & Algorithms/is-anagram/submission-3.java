class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> count2 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(count1.containsKey(ch)){
                count1.put(ch, count1.getOrDefault(ch, 0)+1);
            }else{
                count1.put(ch,1);
            }
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(count2.containsKey(ch)){
                count2.put(ch, count2.getOrDefault(ch, 0)+1);
            }else{
                count2.put(ch,1);
            }
        }

        return count1.equals(count2);
    }
}
