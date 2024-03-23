package org.example;

public class ListNode {
    public int val; // Valor almacenado en el nodo
    public ListNode next; // Referencia al siguiente nodo en la lista

    // Constructor que inicializa un nodo con un valor dado
    public ListNode(int x) {
        val = x; // Asigna el valor dado al nodo
        next = null; // Inicialmente, el nodo no apunta a ningún otro nodo (es el último nodo en la lista)
    }
}
