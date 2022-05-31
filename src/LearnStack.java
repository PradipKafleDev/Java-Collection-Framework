import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("tiger");
        animals.push("elephant");
        animals.push("Girrafe");

        System.out.println("stack: "+ animals);
        System.out.println(animals.peek());

        animals.pop();
        System.out.println("newStack: "+animals);
        System.out.println(animals.peek());

    }

}
