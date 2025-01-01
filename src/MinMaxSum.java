import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
   
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    int n = arr.size();
    
        long s = 0;
 
   for (Integer integer : arr) {
        s+=integer;
   }
   
        
    System.out.print(s-arr.get(n-1)+" "+ (s-arr.get(0)));
    }
    
    }



public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
