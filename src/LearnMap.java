import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {

        //This is key value pair method ; Key is always unique

//        Map<String,Integer> numbers = new HashMap<>();
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("four",4);
        numbers.put("five",5);

//         if(numbers.containsKey("Two")){
//             numbers.put("Two",23);
//         }

        numbers.putIfAbsent("Two",23);

        numbers.remove("two"); // remove 2 from the elements
        System.out.println(numbers);

        for(Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey()); // to iterate key
            System.out.println(e.getValue()); // to iterate value
        }

       for(String key: numbers.keySet()) {
           System.out.println(key);
       }

       for(Integer values :numbers.values()){
           System.out.println(values);
       }
    }
}
