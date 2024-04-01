package challenges;

/**
 * MaximumNumberOfVowelsInASubstringOfGivenLength description.
 *
 * @author Daniel
 * @version 31/03/2024
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLength {

  public static void main(String[] args) {
    System.out.println(maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33));
  }

  private static int maxVowels(String s, int k) {
    int currentVowelCount = 0;

    for (int i = 0; i < k; i++) {
      if (isVowel(s.charAt(i))) {
        currentVowelCount++;
      }
    }

    int maxVowelCount = currentVowelCount;

    for (int i = 0; i < s.length() - k; i++) {
      if (isVowel(s.charAt(i)) && currentVowelCount > 0) {
        currentVowelCount--;
      }
      if (isVowel(s.charAt(i + k))) {
        currentVowelCount++;
      }
      maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
    }

    return maxVowelCount;
  }

  public static boolean isVowel(char ch){
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }

}
