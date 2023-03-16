package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Daniel
 * @Date 15/03/2023
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strings){

        Map<String, List<String>> groupedStrings = Arrays.stream(strings)
                .collect(Collectors.groupingBy(GroupAnagrams::sortString));

        return new ArrayList<>(groupedStrings.values());
    }

    private static String sortString(String string) {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}
