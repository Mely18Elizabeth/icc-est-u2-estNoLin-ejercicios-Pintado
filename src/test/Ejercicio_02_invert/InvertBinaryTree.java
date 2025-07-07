package test.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {

    /**
     * Método que invierte un árbol binario.
     * Intercambia recursivamente los subárboles izquierdo y derecho.
     *
     * @param root raíz del árbol a invertir
     * @return nueva raíz del árbol invertido
     */
    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        // Invertir subárbol izquierdo y derecho recursivamente
        Node left = invertTree(root.getLeft());
        Node right = invertTree(root.getRight());

        // Intercambiar hijos
        root.setLeft(right);
        root.setRight(left);

        return root;
    }
}
