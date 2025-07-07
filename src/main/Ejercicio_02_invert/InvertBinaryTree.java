package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {

    /**
     * Invierte un árbol binario intercambiando recursivamente
     * los subárboles izquierdo y derecho.
     *
     * @param root la raíz del árbol a invertir
     * @return la nueva raíz del árbol invertido
     */
    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        // Invertir recursivamente subárbol izquierdo y derecho
        Node left = invertTree(root.getLeft());
        Node right = invertTree(root.getRight());

        // Intercambiar hijos
        root.setLeft(right);
        root.setRight(left);

        return root;
    }
}
