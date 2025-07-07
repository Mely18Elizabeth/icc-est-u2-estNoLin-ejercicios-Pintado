package test.Ejercicio_04_depth;

import main.Materia.Models.Node;

/**
 * Clase para calcular la profundidad máxima de un árbol binario.
 */
public class DepthTest {

    /**
     * Calcula la profundidad máxima de un árbol.
     *
     * @param root nodo raíz
     * @return profundidad máxima
     */
    public int maxDepth(Node root) {
        if (root == null) return 0;

        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
