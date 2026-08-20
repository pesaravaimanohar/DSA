public class valid_palindrome_125 {
        public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        String t = new StringBuilder(s).reverse().toString();
        if(s.equals(t))
            return true;
        return false;
    }
}
