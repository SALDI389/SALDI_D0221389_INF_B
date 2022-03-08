[21.47, 8/3/2022] Nadia: import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = true;
        if(a==null||b==null||a.equals("")||b.equals("")){
            throw new IllegalArgumentException();
        }
        if(a.length()!=b.length()){
            result = false;
        }else{
            a = a.toLowerCase();
            b = b.toLowerCase();

            java.util.Map<Character, Integer> mapA = new java.util.HashMap<>();
            java.util.Map<Character, Integer> mapB = new java.util.HashMap<>();

            for(int i=0;i<a.length();i++){
                char charA = a.charAt(i);
                char charB = b.charAt(i);
                //untuk character A
             …
[21.47, 8/3/2022] Nadia: day18
[21.59, 8/3/2022] Nadia: import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int lastIndex = s.length()-k;
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for(int i=0;i<=lastIndex;i++){
            String sub = s.substring(i, i+k);
            if(smallest.compareTo(sub)>0){
                smallest = sub;
        }
        if(largest.compareTo(sub)<0){
            largest = sub;
        }
        }
    

        
        
        return smallest + "\n" + largest;
    }
