import java.util.*;
public class anagram_242{
   public boolean isAnagram(String s, String t) {
        Map<Character,Integer> s1 = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(!s1.containsKey(c)){
                int count1 =0;
                int count2=0;
                    for(int j=0;j<s.length();j++){
                        if(s.charAt(j)==c){
                            count1++;
                        }
                        if(t.charAt(j)==c){
                            count2++;
                        }
                    }
                    if(count1!=count2){
                        return false;
                    }
                    else{
                        s1.put(c,count1);
                    }
                }
            }
    return true;
    }
}