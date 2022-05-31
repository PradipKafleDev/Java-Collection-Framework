import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    // Note: Inside set duplicate elements is not allowed
    public static void main(String[] args) {

        /*
        ==============Hash set=====
         */
//        Set<Integer> set = new HashSet<>(); // Hashset print element in random order
//        Set<Integer> set = new LinkedHashSet<>(); // Linkedhash set print element in
//         according to the insertation
        Set<Integer> set = new TreeSet<>(); // Treeset will print element in sorted order

        set.add(2);
        set.add(11);
        set.add(10);
        set.add(16);
        set.add(15);

        System.out.println(set);
        set.remove(10); // remove 10
        set.add(19); // add 19 in the set
        System.out.println(set.size()); // find the size of the array
        set.contains(11); // return boolean true/falls
        System.out.println(set);

    }
}
