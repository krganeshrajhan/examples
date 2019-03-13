import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution1 {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {

        List<Integer> results = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(List<Integer> query : queries) {

            Integer op = query.get(0);
            Integer value = query.get(1);
            if(op == 1) {
                map.put(value, map.getOrDefault(value, 0)+1);
            } else if(op == 2 ) {
                if(map.containsKey(value)) {
                    map.put(value, map.get(value)-1);
                }
            } else if (op == 3) {
                if(map.containsValue(value)) {
                    results.add(1);
                } else {
                    results.add(0);
                }
            }
        }

        return results;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        System.out.println(ans);

       /* bufferedWriter.write(
                ans.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );*/

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
