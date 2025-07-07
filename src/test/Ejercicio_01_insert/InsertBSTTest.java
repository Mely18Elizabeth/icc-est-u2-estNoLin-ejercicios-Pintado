package test.Ejercicio_01_insert;

import main.Materia.Models.Node;

/**
 * Clase que implementa la inserción en un árbol binario de búsqueda (BST).
 */
public class InsertBSTTest {

    /**
     * Inserta un valor en el árbol binario de búsqueda (BST).
     * 
     * @param node  Raíz actual del árbol o subárbol.
     * @param value Valor entero a insertar.
     * @return Nodo raíz actualizado después de la inserción.
     */
    public Node insert(Node node, int value) {
        // Si el nodo es null, se crea uno nuevo
        if (node == null) {
            return new Node(value);
        }

        // Recorremos a la izquierda si el valor es menor
        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        }
        // Recorremos a la derecha si el valor es mayor
        else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }
        // No se permiten valores duplicados
        return node;
    }
}
