import java.util.HashMap;

 class Innerprac1 {

    public boolean Anagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of characters in s1
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            if (!map.containsKey(ch)) return false;

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch); // Clean-up to avoid unnecessary entries
            }
        }

        return map.isEmpty();

    }
}

 public class prac1 {
     public static void main(String[] args) {

         Innerprac1 Ana = new Innerprac1();
         if(Ana.Anagram("hello","ollhe")){
            System.out.println(true);
         }else{
            System.out.println(false);
         }
        }
    }