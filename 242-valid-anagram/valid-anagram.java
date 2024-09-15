class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        for(char idx : s.toCharArray()){
            count[idx - 'a']++;
        }
        for(char idx : t.toCharArray()){
            count[idx - 'a']--;
        }

        for(int value : count){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}