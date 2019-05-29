package may22.estruturadedados;

import java.util.Stack;

public class ExemploStack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        if (stack.empty())
            System.out.println("Empty");

        stack.push("Item 01");
        stack.push("Item 02");
        stack.push("Item 03");
        stack.push("Item 04");

        for (String s : stack)
            System.out.print(s + " ");
        System.out.println();

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        for (String s : stack)
            System.out.print(s + " ");
        System.out.println();

        if (stack.search("Item 02") > -1)
            System.out.println("Posição " + stack.search("Item 02"));

    }
}




