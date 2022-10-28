import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs != null){
            HashMap<String, List<String>> map = new HashMap<>();
            for (int i = 0; i < strs.length; i++) {
                char[] chars = strs[i].toCharArray();
                Arrays.sort(chars);
                String s = Arrays.toString(chars);
                if (map.get(s) != null) {
                    map.get(s).add(strs[i]);
                } else {
                    List<String> a = new ArrayList<>();
                    a.add(strs[i]);
                    map.put(s, a);
                }
            }
            List<List<String>> res = new ArrayList<>();
            for(Map.Entry<String, List<String>> en:map.entrySet()){
                res.add(en.getValue());
            }return res;
        }return null;
    }
}