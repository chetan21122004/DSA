

// Description: Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.
// https://www.hackerrank.com/challenges/three-month-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one






import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int pos =0;
    int neg =0;
    int zero =0;
    int n =arr.size();
for (int i : arr) {
    
    if (i<0) {
        neg++;
    
    } else if (i>0) {
        pos++;
    } else{
        zero++;
    }
}
            String Ppos = String.format("%.6f", (double) pos/n);
            String Pneg = String.format("%.6f", (double) neg/n);
            String Pzero = String.format("%.6f", (double) zero/n);

    System.out.println(Ppos);
    System.out.println(Pneg);
    System.out.println(Pzero);
    

    }

}

public class PosNeg0Avg {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
