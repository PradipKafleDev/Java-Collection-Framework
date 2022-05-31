import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LearnArrayList {
    public static void main(String[] args) {
//        ArrayList<String> studentName = new ArrayList<>();
       // size = n
        //  n+n/2 +1


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        for(int i =0; i<list.size();i++){
            System.out.println("the element is"+ list.get(i));
        }

        for (Integer element:list){
            System.out.println("Foreach element is" + element);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator"+ it.next());
        }


//        list.add(3,7); /// This will add 7 at index 3
//        System.out.println(list);
//
//        List<Integer> newList = new ArrayList<>(); // creating a new array list
//        newList.add(8);
//        newList.add(9);
//
//        list.addAll(newList);  // This will add all the element
//        System.out.println(list);
//
//        System.out.println(list.get(1)); //this will get element from index 1
//        System.out.println(list.remove(2)); // This will remove the selected element
//        System.out.println(list.set(3,12)); // This will set the 12 in index 3;
//


    }
}
