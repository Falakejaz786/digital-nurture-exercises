import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Aman");
        students.add("Riya");
        students.add("John");

        System.out.println(students);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Aman");
        map.put(2, "Riya");

        System.out.println(map.get(1));

        List<String> list = Arrays.asList("Banana", "Apple", "Mango");
        Collections.sort(list, (a, b) -> a.compareTo(b));
        System.out.println(list);

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);

        nums.stream()
            .filter(n -> n % 2 == 0)
            .forEach(n -> System.out.print(n + " "));
    }
}
