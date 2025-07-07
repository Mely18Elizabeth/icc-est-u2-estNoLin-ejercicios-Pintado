package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    /**
     * Calcula la profundidad máxima de un árbol binario.
     *
     * @param root nodo raíz del árbol
     * @return la profundidad máxima (número de niveles)
     */
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
