package topInterview150.challenge;

import java.util.List;
import java.util.stream.Collectors;

/**
 * RoadRepair description.
 *
 * @author Daniel
 * @version 25/02/2024
 */
public class RoadRepair {

  public static long getMinCost(List<Integer> crew_id, List<Integer> job_id) {
    // Write your code here
    crew_id =  crew_id.stream().sorted().collect(Collectors.toList());
    job_id =  job_id.stream().sorted().collect(Collectors.toList());

    System.out.println(crew_id);
    System.out.println(job_id);

    int minCost = 0;

    for (int i = 0; i < crew_id.size(); i++) {
      if (crew_id.get(i) > job_id.get(i)) {
        minCost += crew_id.get(i) - job_id.get(i);
      } else {
        minCost += job_id.get(i) - crew_id.get(i);
      }

    }

    return minCost;
  }

  public static void main(String[] args) {
    System.out.println(getMinCost(List.of(5,9,4,3,8,2), List.of(9,8,1,10,1,4)));
  }

}
