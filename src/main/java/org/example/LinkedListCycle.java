package org.example;

public class LinkedListCycle {
    // Método para determinar si hay un ciclo en una lista enlazada
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false; // No hay ciclo si la lista está vacía o solo tiene un nodo

        ListNode slow = head;
        ListNode fast = head.next; // Iniciar fast desde el segundo nodo

        while (fast != null && fast.next != null) {
            if (slow == fast)
                return true; // Se ha encontrado un ciclo

            slow = slow.next; // Avanzar el puntero lento una posición
            fast = fast.next.next; // Avanzar el puntero rápido dos posiciones
        }

        return false; // Si se alcanza el final de la lista sin encontrar un ciclo, no hay ciclo
    }
}
