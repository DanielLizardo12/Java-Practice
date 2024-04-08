package challenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * main description.
 *
 * @author Daniel
 * @version 09/11/2023
 */
public class Main {

  public static void main(String[] args) {
    String email = "dan@gmail.com";
    String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    //System.out.println(Pattern.compile(regexPattern).matcher(email).matches());

    List<String> cities = new ArrayList<>();

    cities.add("Mexico");
    cities.add("Mexico");
    cities.add("Kansas");
    cities.add("Zacatecas");
    cities.add("Kansas");
    cities.add("New York");
    cities.add("Mongolia");

    Set<String> cititesSet =  new HashSet<>(cities);


    cities.stream()
        .parallel()
        .filter(city -> city.startsWith("M"))
        .filter(city -> city.contains("e"))
        .collect(Collectors.toSet())
        .forEach(System.out::println);


    cititesSet.stream()
        .parallel()
        .filter(city -> city.startsWith("M"))
        .filter(city -> city.contains("e"))
        .forEach(System.out::println);
  }
}
