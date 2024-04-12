package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * main description.
 *
 * @author Daniel
 * @version 09/11/2023
 */
public class Main {

  public static void main(String[] args) {
//    String email = "dan@gmail.com";
//    String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
//    //System.out.println(Pattern.compile(regexPattern).matcher(email).matches());
//
//    List<String> cities = new ArrayList<>();
//
//    cities.add("Mexico");
//    cities.add("Mexico");
//    cities.add("Kansas");
//    cities.add("Zacatecas");
//    cities.add("Kansas");
//    cities.add("New York");
//    cities.add("Mongolia");
//
//    Set<String> cititesSet =  new HashSet<>(cities);
//
//
//    cities.stream()
//        .parallel()
//        .filter(city -> city.startsWith("M"))
//        .filter(city -> city.contains("e"))
//        .collect(Collectors.toSet())
//        .forEach(System.out::println);
//
//
//    cititesSet.stream()
//        .parallel()
//        .filter(city -> city.startsWith("M"))
//        .filter(city -> city.contains("e"))
//        .forEach(System.out::println);

    //String test = "<h1>Nayeem loves counseling</h1>";
    String line = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>";

    String[] splitedString = line.split("\\<");
    HashMap<String, Integer> seenTags = new HashMap<>();
    List<String> resultList = new ArrayList<>();
    AtomicBoolean correctHTML = new AtomicBoolean(true);
    StringBuilder correctLine = new StringBuilder();

    Arrays.stream(splitedString).forEach(string -> {
      if (string.contains("/") && string.contains(">")) {

        String closingTag = string.substring(string.indexOf("/") + 1, string.indexOf(">"));
        if (seenTags.containsKey(closingTag)) {
          if (seenTags.get(closingTag) > 1) {
            seenTags.put(closingTag, seenTags.get(closingTag) - 1);
          } else if (seenTags.get(closingTag) == 1) {
            seenTags.remove(closingTag);
          }
        } else {
          correctHTML.set(false);
        }

      } else if (string.contains(">")) {
        String startingTag = string.substring(0, string.indexOf(">"));
        seenTags.put(startingTag, seenTags.getOrDefault(startingTag, 0) + 1);

        if (string.indexOf(">") + 1 < string.length()) {
          resultList.add(string.substring(string.indexOf(">") + 1));
        }

      }
    });

    if (correctLine.length() > 0) {
      System.out.println("None");
    }
  }
}
