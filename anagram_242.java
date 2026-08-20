import java.util.*;
public class anagram_242{
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> s1 = new HashMap<>();
        Map<Character,Integer> s2 = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                char d = t.charAt(i);
                if(s1.containsKey(c)){
                    s1.put(c,s1.get(c)+1);
                }
                else{
                    s1.put(c,1);
                }
                if(s2.containsKey(d)){
                    s2.put(d,s2.get(d)+1);
                }
                else{
                    s2.put(d,1);
                }

            }
            if(s1.equals(s2)){
                return true;
            }
    return false;
    }
}