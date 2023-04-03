package challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Daniel
 * @Date 02/03/2023
 */

public class IsomorphicStrings {

    //Given two strings s and t, determine if they are isomorphic.
    //Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    //All occurrences of a character must be replaced with another character while
    //preserving the order of characters. No two characters may map to the same character,
    //but a character may map to itself.

    //time complexity for this solution is time O(n) where n is the length of the input strings.
    //This is because we iterate through each character in the input strings only once,
    //and the operations inside the loop are all constant time operations.

    //The space complexity of the solution is O(1) This is because we use two arrays of size 256
    public static boolean isomorphicStrings(String string, String traversed) {
        //If the two strings differ from size they are not isomorphic
        //since not all characters will be mapped to another character.
        if (string.length() != traversed.length()) return false;

        //We create an int array with limit of 256 since that is the maximum we will need
        //since there are only 256 ascii characters
        int[] map = new int[256];

        if (!isIsomorphic(string.toCharArray(), traversed.toCharArray(), map)) {
            return false;
        }

        //Resets the map for the second check.
        Arrays.fill(map, 0);

        return isIsomorphic(traversed.toCharArray(), string.toCharArray(), map);
    }

    //this function will use the map to keep track of the mapping between the characters in s and t
    //for each character in s the function checks if it has already been mapped to a character in t
    //If it has not been mapped, then the function maps it to the corresponding character in t.
    //If it has been mapped, then the function checks that the existing mapping is consistent with the current mapping
    //If the function maps all characters in s without finding any inconsistent mappings then the two strings are isomorphic
    //else it will return false.
    private static boolean isIsomorphic(char[] s, char[] t, int[] map) {
        for (int i = 0; i < s.length; i++) {
            if (map[s[i]] == 0) {
                map[s[i]] = t[i];
            } else if (map[s[i]] != t[i]) {
                return false;
            }
        }
        return true;
    }


    //the initial approach was to use HashMaps, by submitting my code I found out that it would be faster to use arrays.
    //For time and space complexity it will be the same for the array solution.
    public static boolean isomorphicStringsFistApproach(String string, String traversed) {
        if (string.length() != traversed.length()) return false;

        Map<Character, Character> map = new HashMap<>(256);
        Map<Character, Character> mapTraversed = new HashMap<>(256);
        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i)) && traversed.charAt(i) != map.get(string.charAt(i))) return false;
            if (mapTraversed.containsKey(traversed.charAt(i)) && string.charAt(i) != mapTraversed.get(traversed.charAt(i))) return false;
            map.put(string.charAt(i), traversed.charAt(i));
            mapTraversed.put(traversed.charAt(i), string.charAt(i));
        }

        return true;
    }
}
