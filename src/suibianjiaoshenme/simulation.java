package suibianjiaoshenme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class simulation {
    private Set<Car> cars = new HashSet<>();
    private Set<Ride> rides = new HashSet<>();

    private static void input(String path) throws FileNotFoundException {
        Scanner input = new Scanner(new FileInputStream(path));
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        while (input.hasNextInt()) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (!graph.containsKey(a)) {
                graph.put(a, new HashSet<>());
            }
            if (!graph.containsKey(b)) {
                graph.put(b, new HashSet<>());
            }
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        input("a_example");
    }
}
