package may22.estruturadedados;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Item 01");
        queue.offer("Item 02");
        queue.offer("Item 03");
        queue.offer("Item 04");


        for (String s : queue) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("Primeiro - " + queue.peek());
        System.out.println("Removido - " + queue.poll());
        System.out.println("Novo Primeiro - " + queue.peek());
        queue.clear();

    }
}



