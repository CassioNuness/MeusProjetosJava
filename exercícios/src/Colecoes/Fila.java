package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        //Offer e  Add -> adicionam elementos na fila
        
        //A defirença e que o comportamento ocorre
        //quando a fila está cheia!
        fila.add("Ana"); //retorna false
        fila.offer("Bia"); //lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");
        
        // Peek e Element -> obter o próximo elemento da fila (sem remover).
        
        //A diferença e o comportamento que ocorre
        // quando a fila está vazia!
        System.out.println(fila.peek()); //Retorna Null
        System.out.println(fila.peek());
        System.out.println(fila.element()); //lança uma exceção
        System.out.println(fila.element());
        
        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        
        // Poll e Remove -> obter o próximo elemento da fila e remover.
        
        //A diferença e o comportamento que ocorre
        // quando a fila está vazia!
        
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        
        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains(...);
        
        
    }

}
