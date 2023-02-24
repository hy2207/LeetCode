package practice_leetcode;

import java.util.HashMap;

public class solution205 {

	public static void main(String[] args) {
		
		System.out.println("My Solution: " + isIsomorphic("badc", "baba"));	
		System.out.println("Other's Soltuion: " + isIsomorphic2("badc", "baba"));
		
	}
	//my solution
	public static boolean isIsomorphic(String s, String t) {
        return helper(s,t) && helper(t,s);
    }
    
    private static boolean helper(String s, String t){

        HashMap<Character, Character> check = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(check.containsKey(charS) && check.get(charS) != charT){
                return false;
            } else {
                check.put(charS, charT);
            }
        }
        return true;
    }
    
	//other's solution
	public static boolean isIsomorphic2 (String s, String t) {
        int[] m1 = new int[128];
        int[] m2 = new int[128];
        for (int i = 0; i < s.length(); i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }

}
