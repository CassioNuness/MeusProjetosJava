package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        //Offer e  Add -> adicionam elementos na fila
        
        //A defiren�a e que o comportamento ocorre
        //quando a fila est� cheia!
        fila.add("Ana"); //retorna false
        fila.offer("Bia"); //lan�a uma exce��o
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");
        
        // Peek e Element -> obter o pr�ximo elemento da fila (sem remover).
        
        //A diferen�a e o comportamento que ocorre
        // quando a fila est� vazia!
        System.out.println(fila.peek()); //Retorna Null
        System.out.println(fila.peek());
        System.out.println(fila.element()); //lan�a uma exce��o
        System.out.println(fila.element());
        
        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        
        // Poll e Remove -> obter o pr�ximo elemento da fila e remover.
        
        //A diferen�a e o comportamento que ocorre
        // quando a fila est� vazia!
        
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
