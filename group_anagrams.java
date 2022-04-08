class Solution {
    public List<List<String>> groupAnagrams(String[] strings) {
        if (strings == null || strings.length == 0) return new ArrayList<>();
       HashMap<String, List<String>> hashMap = new HashMap<>();
    for (String str : strings){
        char []chars = str.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        if (!hashMap.containsKey(key)){
            hashMap.put(key,new ArrayList<>());
        }
        hashMap.get(key).add(str);
    }
    return new ArrayList<>(hashMap.values());
    }
    
// For each string, map frequencies for each character in the string to an array.
// Get the hashcode of that array.
// In HashMap, all we're saying is that if it exists an entry with a given hashcode, then just append it. Two arrays will be having the same hashcode if they're anagrams. Otherwise, make a new LinkedList
// After that, for each entrySet in the HashMap, append its value, which is lists of anagram, to a resulting list.
    
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> res = new LinkedList<>();
//         Map<Integer, List<String>> map = new HashMap<>();

//         for (var s : strs) {
//             var code = getUniqueCode(s);
//             map.putIfAbsent(code, new LinkedList<>());
//             map.get(code).add(s);
//         }

//         for (var entry : map.entrySet()) {
//             res.add(entry.getValue());
//         }

//         return res;

//     }

//     public int getUniqueCode(String s) {
//         var bucket = new int[26];

//         for (var c : s.toCharArray()) bucket[c - 'a'] += 1;

//         return Arrays.hashCode(bucket);
//     }
}
