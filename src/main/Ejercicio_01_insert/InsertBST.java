package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {

    /**
     * Inserta un valor en el árbol binario de búsqueda (BST).
     * 
     * @param root  la raíz del árbol o subárbol
     * @param value el valor a insertar
     * @return la nueva raíz del árbol después de la inserción
     */
    public Node insert(Node root, int value) {
        // Si el árbol está vacío, crea un nuevo nodo y lo retorna
        if (root == null) {
            return new Node(value);
        }

        // Si el valor a insertar es menor que el valor del nodo actual, inserta en el subárbol izquierdo
        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } 
        // Si el valor es mayor, inserta en el subárbol derecho
        else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }
        // Si el valor es igual, no inserta (evita duplicados)

        return root; // retorna la raíz actualizada
    }
}
