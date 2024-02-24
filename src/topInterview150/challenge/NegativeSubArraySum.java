package topInterview150.challenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * NegativeSubArraySum description.
 *
 * @author Daniel
 * @version 24/02/2024
 */
public class NegativeSubArraySum {

  public static void main(String[] args) {
    int negativeSubArrays = 0;
    ArrayList<Integer> arrayList = new ArrayList<>();

    arrayList.add(1);
    arrayList.add(-2);
    arrayList.add(4);
    arrayList.add(-5);
    arrayList.add(1);


    int subArrayLength = 0;

    while(subArrayLength < arrayList.size()) {
      for (int i = 0; i < arrayList.size(); i++) {
        if(i + subArrayLength < arrayList.size()) {

          int currentSubArrayTotal = 0;

          for (int j = i; j <= i + subArrayLength; j++) {
            currentSubArrayTotal += arrayList.get(j);
          }

          if(currentSubArrayTotal < 0) {
            negativeSubArrays++;
          }

        }
      }
      subArrayLength++;
    }


    System.out.println(negativeSubArrays);
  }

}
