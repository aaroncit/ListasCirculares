package org.example;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de la clase LinkedListCycle
        LinkedListCycle solution = new LinkedListCycle();

        // Ejemplo 1
        ListNode head1 = createLinkedList(new int[]{3, 2, 0, -4}, 1);

        // Verificamos si hay un ciclo en head1 y mostramos el resultado
        System.out.println("Output: " + solution.hasCycle(head1)); // Esperado: true

        // Ejemplo 2
        ListNode head2 = createLinkedList(new int[]{1, 2}, 0);

        // Verificamos si hay un ciclo en head2 y mostramos el resultado
        System.out.println("Output: " + solution.hasCycle(head2)); // Esperado: true

        // Ejemplo 3
        ListNode head3 = createLinkedList(new int[]{1}, -1);

        // Verificamos si hay un ciclo en head3 y mostramos el resultado
        System.out.println("Output: " + solution.hasCycle(head3)); // Esperado: false
    }

    // Método para crear una lista enlazada con un ciclo en la posición indicada
    private static ListNode createLinkedList(int[] values, int cyclePos) {
        if (values == null || values.length == 0) return null;

        ListNode[] nodes = new ListNode[values.length];
        for (int i = 0; i < values.length; i++) {
            nodes[i] = new ListNode(values[i]);
        }

        // Construimos la lista enlazada
        for (int i = 0; i < values.length - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        // Agregamos el ciclo si la posición es válida
        if (cyclePos >= 0 && cyclePos < values.length) {
            nodes[values.length - 1].next = nodes[cyclePos];
        }

        return nodes[0]; // Devolvemos el nodo de la cabeza de la lista enlazada
    }
}
