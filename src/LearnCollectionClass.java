import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(4);
        list.add(1);
        list.add(33);
        list.add(9);

        System.out.println(list);

        System.out.println("min element is: "+ Collections.min(list));
        System.out.println("max element is: "+ Collections.max(list));
       Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
