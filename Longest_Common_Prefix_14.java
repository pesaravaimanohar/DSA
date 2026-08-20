public class Longest_Common_Prefix_14 {
    public String longestCommonPrefix(String[] strs) {
        String result ="";
        if(strs!=null && !strs[0].isEmpty()){
        for(int i=0;i<strs[i].length();i++){
            char c = strs[i].charAt(i);
            boolean check = true;
            for(int j=0;j<strs.length;j++){
                if(strs[j].length()<=i || strs[j].charAt(i)!=c){
                    check = false;
                    break;
                }
            }
            if(check==false){
                return result;
            }
            else
                result = result+c;
        }
        }
        return result;
    }
}
