// Description: Given the scores of a game, find the number of times the highest and lowest scores were broken.
// https://www.hackerrank.com/challenges/three-month-preparation-kit-breaking-best-and-worst-records/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */
  
    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
List<Integer> num = new ArrayList<>(2);

    int mxscr=scores.get(0);
    int minscr=scores.get(0);
    int scrBrkmx = 0;
    int scrBrkmin = 0;
    
    for (int i = 1; i < scores.size(); i++) {
        int cur = scores.get(i);
        if (mxscr<cur) {
            mxscr=cur;
            scrBrkmx++;
        } else if (minscr>cur) {
            minscr=cur;
            scrBrkmin++;
            
           
        }
    }
    num.add(scrBrkmx);
    num.add(scrBrkmin);
    return num;
    
    }

}

public class MinMaxScoreCoun {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);
            
        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
